/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asistensi1;

import java.net.*;

/**
 *
 * @author reyna
 */
public class No_4 
{
    public static void main(String[] args) 
    {
        try 
        {
            InetAddress address = InetAddress.getLocalHost();
            
            NetworkInterface netin = NetworkInterface.getByInetAddress(address);
            if (netin != null) 
            {
                byte[] mac = netin.getHardwareAddress();
                if (mac != null) 
                {
                    System.out.print("MAC Address dari interface " + address + " adalah ");
                    for (int i = 0; i < mac.length; i++) 
                    {
                        System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                    }
                    System.out.println();
                } else 
                {
                    System.out.println("Address tidak ada atau tidak dapat diakses.");
                }
            } else 
            {
                System.out.println("Network Interface untuk alamat tersebut tidak ditemukan.");
            }
        } catch (UnknownHostException e) 
        {
       
        } catch (SocketException e) 
        {
           
        }
    }
}
