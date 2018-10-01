package chat.dropdevelopers.com.myutils;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class Loading extends LinearLayout implements Animation.AnimationListener {

    private LinearLayout loadingBar;
    private Animation loadingAnimation;

    public Loading(Context context) {
        super(context);
        init();
    }

    public Loading(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Loading(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        loadingBar.startAnimation(loadingAnimation);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    private void init() {
        inflate(getContext(), R.layout.activity_loading, this);
        loadingAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.move);
        loadingBar = findViewById(R.id.loadingBar);
        loadingBar.startAnimation(loadingAnimation);
        loadingAnimation.setAnimationListener(this);
    }

}
