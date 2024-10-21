package com.InternProjects.e_commerce.order;

import com.InternProjects.e_commerce.orderItem.OrderItem;
import com.InternProjects.e_commerce.orderItem.OrderItemDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-17T04:41:40+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderDto toDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDto orderDto = new OrderDto();

        orderDto.setCustomerID( order.getCustomerID() );
        orderDto.setOrderDate( order.getOrderDate() );
        orderDto.setTotalAmount( order.getTotalAmount() );
        orderDto.setShippingAddress( order.getShippingAddress() );
        orderDto.setOrderStatus( order.getOrderStatus() );
        orderDto.setOrderItem( orderItemListToOrderItemDtoList( order.getOrderItem() ) );

        return orderDto;
    }

    @Override
    public Order toOrder(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        Order order = new Order();

        order.setCustomerID( orderDto.getCustomerID() );
        order.setOrderDate( orderDto.getOrderDate() );
        order.setTotalAmount( orderDto.getTotalAmount() );
        order.setShippingAddress( orderDto.getShippingAddress() );
        order.setOrderStatus( orderDto.getOrderStatus() );
        order.setOrderItem( orderItemDtoListToOrderItemList( orderDto.getOrderItem() ) );

        return order;
    }

    protected OrderItemDto orderItemToOrderItemDto(OrderItem orderItem) {
        if ( orderItem == null ) {
            return null;
        }

        OrderItemDto orderItemDto = new OrderItemDto();

        orderItemDto.setQuantity( orderItem.getQuantity() );
        orderItemDto.setItemPrice( orderItem.getItemPrice() );
        orderItemDto.setOrder( toDto( orderItem.getOrder() ) );
        orderItemDto.setProduct( orderItem.getProduct() );

        return orderItemDto;
    }

    protected List<OrderItemDto> orderItemListToOrderItemDtoList(List<OrderItem> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderItemDto> list1 = new ArrayList<OrderItemDto>( list.size() );
        for ( OrderItem orderItem : list ) {
            list1.add( orderItemToOrderItemDto( orderItem ) );
        }

        return list1;
    }

    protected OrderItem orderItemDtoToOrderItem(OrderItemDto orderItemDto) {
        if ( orderItemDto == null ) {
            return null;
        }

        OrderItem.OrderItemBuilder orderItem = OrderItem.builder();

        orderItem.quantity( orderItemDto.getQuantity() );
        orderItem.itemPrice( orderItemDto.getItemPrice() );
        orderItem.order( toOrder( orderItemDto.getOrder() ) );
        orderItem.product( orderItemDto.getProduct() );

        return orderItem.build();
    }

    protected List<OrderItem> orderItemDtoListToOrderItemList(List<OrderItemDto> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderItem> list1 = new ArrayList<OrderItem>( list.size() );
        for ( OrderItemDto orderItemDto : list ) {
            list1.add( orderItemDtoToOrderItem( orderItemDto ) );
        }

        return list1;
    }
}
