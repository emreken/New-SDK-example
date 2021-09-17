package com.relateddigital.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.relateddigital.myapplication.databinding.ActivityMainBinding;
import com.relateddigital.relateddigital_android.RelatedDigital;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        setupUi();
    }

    private void setupUi() {
        binding.fullButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("full");
            }
        });

        binding.miniButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("mini");
            }
        });

        binding.fullImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("full_image");
            }
        });

        binding.imageButtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("image_button");
            }
        });

        binding.imageTextButtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("image_text_button");
            }
        });

        binding.smileRatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("smile_rating");
            }
        });

        binding.npsWithNumbersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("nps_with_numbers");
            }
        });

        binding.npsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("nps");
            }
        });

        binding.nativeAlertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("alert_native");
            }
        });

        binding.actionSheetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("alert_actionsheet");
            }
        });

        binding.mailSubsFormButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("mailsubsform");
            }
        });

        binding.scratchToWinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("scratch-to-win");
            }
        });

        binding.spinToWinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("spintowin");
            }
        });

        binding.socialProofButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("social-proof");
            }
        });

        binding.countdownTimerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("countdown-timer");
            }
        });

        binding.inAppCarouselButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sendInAppRequest("in-app-carousel");
            }
        });

        binding.shakeToWinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("shake-to-win");
            }
        });

        binding.appTrackerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sendTheListOfAppsInstalled();
            }
        });

        binding.nps1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("nps-image-text-button");
            }
        });

        binding.nps2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("nps-image-text-button-image");
            }
        });

        binding.nps3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendInAppRequest("nps-feedback");
            }
        });
    }

    private void sendInAppRequest(String type) {
        HashMap<String, String> parameters = new HashMap<String, String>();
        parameters.put("OM.inapptype", type);
        RelatedDigital.customEvent(getApplicationContext(), "in-app", parameters, this);
    }
}