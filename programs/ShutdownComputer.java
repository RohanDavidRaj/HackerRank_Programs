package com.hackerrank.programs;

import com.jcraft.jsch.*;
import com.mysql.cj.xdevapi.Session;

public class ShutdownComputer {

    public static void main(String[] args) {
        String username = "lokesh"; // Replace with the username for the target computer
        String password = "75374"; // Replace with the password for the target computer
        String hostname = "10.10.51.274"; // Replace with the hostname or IP address of the target computer
        int port = 22; // The default SSH port is 22
        try {
            JSch jsch = new JSch();
            com.jcraft.jsch.Session session = jsch.getSession(username, hostname, port);
            session.setPassword(password);
            session.setConfig("StrictHostKeyChecking", "no"); // Disable host key checking
            session.connect();
            ChannelExec channel = (ChannelExec) session.openChannel("exec");
            String command = "sudo shutdown now"; // The shutdown command for Linux/Unix systems
            channel.setCommand(command);
            channel.connect();
            channel.disconnect();
            session.disconnect();
            System.out.println("Shutdown command sent to " + hostname);
        } catch (JSchException e) {
            System.out.println("Failed to connect to " + hostname);
            e.printStackTrace();
        }
    }

}
