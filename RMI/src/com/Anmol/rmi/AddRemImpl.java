package com.Anmol.rmi;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class AddRemImpl extends UnicastRemoteObject implements AddRem {

	public AddRemImpl() throws RemoteException{}

	@Override
	public int addNum(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
