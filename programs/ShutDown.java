package com.hackerrank.programs;

import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ShutDown {

	public static void main(String[] args) {
		String targetIp = "10.10.20.105"; // Replace with the IP address of the target computer
		try {
			InetAddress address = InetAddress.getByName(targetIp);
			ProcessBuilder builder = new ProcessBuilder("shutdown", "-s", "-t", "0", "-f");
			builder.redirectErrorStream(true);
			builder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
			builder.start();
			System.out.println("Shutdown command sent to " + targetIp);
		} catch (UnknownHostException e) {
			System.out.println("Unknown host: " + targetIp);
		} catch (IOException e) {
			System.out.println("Failed to send shutdown command to " + targetIp);
			e.printStackTrace();
		}

	}
}
