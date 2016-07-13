package com.gsma.android.model;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by nick.copley on 19/02/2016.
 */
public class AuthModel
{
    private static final AuthModel ourInstance = new AuthModel();

    private AtomicBoolean authInProgress;

    private String token;

    private AuthModel()
    {
    }

    public static AuthModel getInstance()
    {
        return ourInstance;
    }

}
