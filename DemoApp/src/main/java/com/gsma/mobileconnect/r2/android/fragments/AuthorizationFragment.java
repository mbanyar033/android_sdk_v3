package com.gsma.mobileconnect.r2.android.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gsma.mobileconnect.r2.android.demo.R;
import com.gsma.mobileconnect.r2.android.interfaces.ITitle;
import com.gsma.mobileconnect.r2.constants.Scopes;

public class AuthorizationFragment extends BaseAuthFragment implements ITitle
{
    public static AuthorizationFragment newInstance()
    {
        return new AuthorizationFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_authorization, container, false);

        setupUIAndMobileConnectAndroid(view, Scopes.MOBILECONNECTAUTHORIZATION);

        return view;
    }

    @Override
    public String getTitle()
    {
        return "Authorization";
    }
}