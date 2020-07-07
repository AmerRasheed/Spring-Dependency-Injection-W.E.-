package org.example.service;

public class AppUserIdSequencerImpl implements AppUserIdSequencer {
    private int number=0;

    @Override
    public int nextid() {
        return ++number;
    }

    @Override
    public void clear() {
      number=0;
    }
}
