package com.mt.orderdetails;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mt.orderdetails.model.Contact;
import com.mt.orderdetails.model.Order;
import com.mt.orderdetails.model.OrderDetails;
import com.mt.orderdetails.model.OrderPayment;
import com.mt.orderdetails.model.Payment;
import com.mt.orderdetails.model.Products;



public class OrderApp
{
	public static void main(String[] args)
	{
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder()
				.configure()
				.build();
		SessionFactory factory = new MetadataSources(registry)
				.buildMetadata().buildSessionFactory();
		org.hibernate.Session session=factory.openSession();
		Products product1=new Products( "moto e4 plus",2000);
		Products product2=new Products( "samsung",500);
		Products product3=new Products( "lenovo",6000);
		
		Payment payment1=new Payment("phonepay"," paid");
		
		Order order1=new Order( "Ramya",20);
		Order order2=new Order( "siva",10);
		Order order3=new Order( "Teju",50);
		
		OrderDetails orderDetail1 = new OrderDetails(product1,order1,1,100);
		OrderDetails orderDetail2 = new OrderDetails(product2,order2,3,200);
		
		Contact contact1=new Contact("sonu","street","thiruvallur","tn","india",444449,1111087765);
		OrderPayment orderpayment=new OrderPayment(payment1,order1,500);
		
		order1.addOrderDetails(orderDetail1);
		order1.addOrderDetails(orderDetail2);
		order1.addOrderPayment(orderpayment);
		
		order1.setContact(contact1);

		session.save(order1);
		session.save(order2);
		
		session.close();
		factory.close();
	}

}

