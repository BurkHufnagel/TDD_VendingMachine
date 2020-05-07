//package com.dbs;
//
//
//public class CoinDispenserUpdate {
//    private int amountHeld = 0;
//
//
//    public int getAmountHeld() {
//        return amountHeld;
//    }
//
//
//    public void insertCoin( Coin coin ) {
//        amountHeld += coin.getValue();
//    }
//
//
//    public int returnAmount( int amountRequested ) {
//        int amountReturned = 0;
//
//        if( amountRequested <= amountHeld ) {
//            amountHeld -= amountRequested;
//            amountReturned = amountRequested;
//        }
//
//        return amountReturned;
//    }
//}
