package com.ali.wallet.ui;

import android.support.v4.app.Fragment;

import com.ali.core.wallet.WalletAccount;


public abstract class WalletFragment extends Fragment implements ViewUpdateble {
    abstract public WalletAccount getAccount();
}
