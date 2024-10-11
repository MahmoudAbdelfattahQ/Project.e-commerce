CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE "Users" (
                         "User_ID" uuid PRIMARY KEY  DEFAULT uuid_generate_v4(),
                         "Username" VARCHAR(50),
                         "First_Name" VARCHAR(50),
                         "Last_Name" VARCHAR(50),
                         "Password" VARCHAR(100),
                         "Email" VARCHAR(100),
                         "Role" VARCHAR(20),
                         "Date_Joined" DATE,
                         "Last_Login" DATE
);

CREATE TABLE "Inventory" (
                             "Inventory_ID" INTEGER PRIMARY KEY,
                             "Product_ID" bigint,
                             "Warehouse_ID" INTEGER,
                             "Quantity" INTEGER
);

CREATE TABLE "Products" (
                            "Product_ID" bigint PRIMARY KEY,
                            "Name" VARCHAR(100),
                            "Description" TEXT,
                            "Price" DECIMAL(10,2),
                            "Brand" VARCHAR(50),
                            "Category" VARCHAR(50),
                            "Weight" DECIMAL(5,2),
                            "Is_Available" BOOLEAN
);

CREATE TABLE "Cart" (
                        "Cart_ID" bigint PRIMARY KEY,
                        "Customer_ID" bigint,
                        "Total_Price" DECIMAL(10,2)
);

CREATE TABLE "Cart_Products" (
                                 "cart_id" bigint NOT NULL,
                                 "product_id" bigint NOT NULL,
                                 "Price" decimal(10,2) NOT NULL,
                                 "quantity" INT NOT NULL DEFAULT 1
);

CREATE TABLE "Customers" (
                             "Customer_ID" bigint PRIMARY KEY,
                             "User_ID" uuid,
                             "Phone" VARCHAR(20),
                             "Address" VARCHAR(200)
);

CREATE TABLE "Orders" (
                          "Order_ID" bigint PRIMARY KEY,
                          "Customer_ID" bigint,
                          "Order_Date" DATE,
                          "Total_Amount" DECIMAL(10,2),
                          "Shipping_Address" VARCHAR(200),
                          "Order_Status" VARCHAR(50)
);

CREATE TABLE "Order_Items" (
                               "Order_Item_ID" bigint PRIMARY KEY,
                               "Order_ID" bigint,
                               "Product_ID" bigint,
                               "Quantity" INTEGER,
                               "Item_Price" DECIMAL(10,2)
);

CREATE TABLE "Warehouses" (
                              "Warehouse_ID" INTEGER PRIMARY KEY,
                              "Warehouse_Name" VARCHAR(100),
                              "Location" VARCHAR(200)
);

ALTER TABLE "Inventory" ADD FOREIGN KEY ("Product_ID") REFERENCES "Products" ("Product_ID");

ALTER TABLE "Inventory" ADD FOREIGN KEY ("Warehouse_ID") REFERENCES "Warehouses" ("Warehouse_ID");

ALTER TABLE "Cart" ADD FOREIGN KEY ("Customer_ID") REFERENCES "Customers" ("Customer_ID");

ALTER TABLE "Cart_Products" ADD FOREIGN KEY ("cart_id") REFERENCES "Cart" ("Cart_ID");

ALTER TABLE "Cart_Products" ADD FOREIGN KEY ("product_id") REFERENCES "Products" ("Product_ID");

ALTER TABLE "Customers" ADD FOREIGN KEY ("User_ID") REFERENCES "Users" ("User_ID");

ALTER TABLE "Orders" ADD FOREIGN KEY ("Customer_ID") REFERENCES "Customers" ("Customer_ID");

ALTER TABLE "Order_Items" ADD FOREIGN KEY ("Order_ID") REFERENCES "Orders" ("Order_ID");

ALTER TABLE "Order_Items" ADD FOREIGN KEY ("Product_ID") REFERENCES "Products" ("Product_ID");
