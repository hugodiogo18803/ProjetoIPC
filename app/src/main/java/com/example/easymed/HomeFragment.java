package com.example.easymed;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button takeButton;
    private Button takeButton2;
    private Button takeButton3;
    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        takeButton = view.findViewById(R.id.button6);
        takeButton2 = view.findViewById(R.id.button7);
        takeButton3 = view.findViewById(R.id.button3);
        takeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (takeButton.isEnabled()) {
                    takeButton.setEnabled(false);
                    takeButton.setText("Taken");
                } else {
                    takeButton.setEnabled(true);
                    takeButton.setText("Take");
                }
            }
        });
        takeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (takeButton2.isEnabled()) {
                    takeButton2.setEnabled(false);
                    takeButton2.setText("Taken");
                } else {
                    takeButton2.setEnabled(true);
                    takeButton2.setText("Take");
                }
            }
        });
        takeButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (takeButton3.isEnabled()) {
                    takeButton3.setEnabled(false);
                    takeButton3.setText("Taken");
                } else {
                    takeButton3.setEnabled(true);
                    takeButton3.setText("Take");
                }
            }
        });
        return view;
    }
}