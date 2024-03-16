package com.example.midtermaaronchiu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.midtermaaronchiu.databinding.FragmentFirstBinding;
import com.google.android.material.textfield.TextInputLayout;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private int meter = 0;
    
    private int millimeter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText meterInput = view.findViewById(R.id.meter_text_input);


                if ((R.id.meter_text_input >= 0)) {
                    millimeter = meter * 100;
                    view.findViewById(R.id.millimeterOutput).setTextDirection(millimeter);
                    
                } else {
                    meterInput.setText(null);
                }

            }
        });
    }



}