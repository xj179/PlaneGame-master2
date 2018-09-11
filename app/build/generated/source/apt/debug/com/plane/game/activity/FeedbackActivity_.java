//
// DO NOT EDIT THIS FILE.
// Generated using AndroidAnnotations 4.4.0.
// 
// You can create a larger work that contains this file and distribute that work under terms of your choice.
//

package com.plane.game.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import com.plane.game.R;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.builder.PostActivityStarter;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class FeedbackActivity_
    extends FeedbackActivity
    implements HasViews, OnViewChangedListener
{
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(R.layout.activity_feedback);
    }

    @Override
    public<T extends View> T internalFindViewById(int id) {
        return ((T) this.findViewById(id));
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static FeedbackActivity_.IntentBuilder_ intent(Context context) {
        return new FeedbackActivity_.IntentBuilder_(context);
    }

    public static FeedbackActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new FeedbackActivity_.IntentBuilder_(fragment);
    }

    public static FeedbackActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new FeedbackActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        this.contactEt = hasViews.internalFindViewById(R.id.contactEt);
        this.contentEt = hasViews.internalFindViewById(R.id.contentEt);
        this.commitBtn = hasViews.internalFindViewById(R.id.commitBtn);
        this.back_iv = hasViews.internalFindViewById(R.id.back_iv);
        if (this.back_iv!= null) {
            this.back_iv.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    FeedbackActivity_.this.click(view);
                }
            }
            );
        }
        if (this.commitBtn!= null) {
            this.commitBtn.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    FeedbackActivity_.this.click(view);
                }
            }
            );
        }
        afterView();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<FeedbackActivity_.IntentBuilder_>
    {
        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, FeedbackActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), FeedbackActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), FeedbackActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public PostActivityStarter startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent, requestCode, lastOptions);
                } else {
                    if (context instanceof Activity) {
                        Activity activity = ((Activity) context);
                        ActivityCompat.startActivityForResult(activity, intent, requestCode, lastOptions);
                    } else {
                        context.startActivity(intent, lastOptions);
                    }
                }
            }
            return new PostActivityStarter(context);
        }
    }
}