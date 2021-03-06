package com.volianskyi.taras.reservationapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.volianskyi.taras.reservationapplication.MainActivity;
import com.volianskyi.taras.reservationapplication.R;

/**
 * Created by tarasvolianskyi on 29.01.18.
 */

public class OnlineReservation extends Fragment implements View.OnClickListener {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.online_reservation, container, false);
        initView();
        return view;
    }

    private void initView() {
        Button btnEmployee = (Button) view.findViewById(R.id.btnEmployeeOnlineReservationLayout);
        Button btnOption = (Button) view.findViewById(R.id.btnOptionOnlineReservationLayout);
        Button btnDateAndTime = (Button) view.findViewById(R.id.btnDateAndTimeOnlineReservationLayout);
        btnEmployee.setOnClickListener(this);
        btnOption.setOnClickListener(this);
        btnDateAndTime.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnDateAndTimeOnlineReservationLayout:
                Toast.makeText(getActivity(), "Click on next", Toast.LENGTH_SHORT).show();
                ((MainActivity) getActivity()).goToCalendar();
                break;
        }
    }
}
