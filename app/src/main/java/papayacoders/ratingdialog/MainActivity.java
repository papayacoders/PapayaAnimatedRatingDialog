package papayacoders.ratingdialog;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import papayacoders.animateddialog.RatingDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        papayacoders.animateddialog.RatingDialog mRatingDialog = new papayacoders.animateddialog.RatingDialog(this);


        findViewById(R.id.button).setOnClickListener(v -> {
            mRatingDialog.showDialog();
        });

//        mRatingDialog.setRatingDialogListener(new RatingDialog.RatingDialogInterFace() {
//            @Override
//            public void onDismiss() {
//                Log.v("RATELISTERNER", "onDismiss ");
//            }
//
//            @Override
//            public void onSubmit(float rating) {
//                Log.v("RATELISTERNER", "onSubmit " + rating);
//            }
//
//            @Override
//            public void onRatingChanged(float rating) {
//                Log.v("RATELISTERNER", "onRatingChanged " + rating);
//            }
//        });
    }
}