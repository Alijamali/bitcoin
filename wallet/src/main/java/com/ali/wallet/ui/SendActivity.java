package com.ali.wallet.ui;

import android.content.Intent;
import android.os.Bundle;

import com.ali.wallet.Constants;


@Deprecated
public class SendActivity extends BaseWalletActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, WalletActivity.class);
        intent.putExtra(Constants.ARG_URI, getIntent().getDataString());
        startActivity(intent);

        finish();
    }
}