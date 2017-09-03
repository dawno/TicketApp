package com.example.dellpc.ticketapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;

import com.google.android.gms.vision.barcode.Barcode;

import java.util.List;

import info.androidhive.barcode.BarcodeReader;

public class MainActivity extends AppCompatActivity implements BarcodeReader.BarcodeReaderListener {
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

@Override
public void onScanned(Barcode barcode) {
        // single barcode scanned
        }

@Override
public void onScannedMultiple(List<Barcode> list) {
        // multiple barcodes scanned
        }

@Override
public void onBitmapScanned(SparseArray<Barcode> sparseArray) {
        // barcode scanned from bitmap image
        }

@Override
public void onScanError(String s) {
        // scan error
        }
        }