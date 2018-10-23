package com.ali.core.wallet.families.bitcoin;

import com.ali.core.network.AddressStatus;
import com.ali.core.network.ServerClient.UnspentTx;
import com.ali.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
