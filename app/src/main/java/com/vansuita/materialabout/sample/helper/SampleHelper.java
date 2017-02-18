package com.vansuita.materialabout.sample.helper;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;

import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.sample.R;

/**
 * Created by jrvansuita on 17/02/17.
 */

public class SampleHelper implements View.OnClickListener{

    private Activity activity;
    private static int theme = R.style.AppThemeDark;

    private SampleHelper(Activity activity) {
        this.activity = activity;
    }

    public static SampleHelper with(Activity activity){
        return new SampleHelper(activity);
    }

    public SampleHelper init(){
        activity.setTheme(theme);

        activity.findViewById(R.id.dark).setOnClickListener(this);
        activity.findViewById(R.id.light).setOnClickListener(this);
        activity.findViewById(R.id.custom).setOnClickListener(this);

        return this;
    }

    public void loadAbout() {
        final FrameLayout flHolder = (FrameLayout) activity.findViewById(R.id.about);

        flHolder.addView(
                AboutBuilder.with(activity)
                        .setAppIcon(R.mipmap.ic_launcher)
                        .setAppName(R.string.app_name)
                        .setPhoto(R.mipmap.testex)
                        .setCover(R.mipmap.profile_cover)
                        .setLinksAnimated(false)
                        .setDividerDashGap(13)
                        .setName("Your Full Name")
                        .setSubTitle("Mobile Developer")
                        .setLinksColumnsCount(4)
                        .setBrief("I'm warmed of mobile technologies. Ideas maker, curious and nature lover.")
                        .addGooglePlayStoreLink("8002078663318221363")
                        .addGitHubLink("jrvansuita")
                        .addBitbucketLink("jrvansuita")
                        .addFacebookLink("user")
                        .addTwitterLink("user")
                        .addInstagramLink("jnrvans")
                        .addGooglePlusLink("103588649850838411440")
                        .addYoutubeChannelLink("103588649850838411440")
                        .addDribbleLink("user")
                        .addLinkedinLink("arleu-cezar-vansuita-júnior-83769271")
                        .addEmailLink("vansuita.jr@gmail.com")
                        .addWhatsappLink("Jr", "+554799650629")
                        .addSkypeLink("user")
                        .addGoogleLink("user")
                        .addAndroidLink("user")
                        .addWebsiteLink("site")
                        .addFiveStarsAction()
                        .addMoreFromMeAction("Vansuita")
                        .setVersionAsAppTitle()
                        .addShareAction(R.string.app_name)
                        .addUpdateAction()
                        .setActionsColumnsCount(2)
                        .addFeedbackAction("vansuita.jr@gmail.com")
                        .addIntroduceAction((Intent) null)
                        .addHelpAction((Intent) null)
                        .addChangeLogAction((Intent) null)
                        .addRemoveAdsAction((Intent) null)
                        .addDonateAction((Intent) null)
                        .build());
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dark:
                if (theme != R.style.AppThemeDark) {
                    theme = R.style.AppThemeDark;
                    activity.recreate();
                }
                break;
            case R.id.light:
                if (theme != R.style.AppThemeLight) {
                    theme = R.style.AppThemeLight;
                    activity.recreate();
                }
                break;

            case R.id.custom:
                if (theme != R.style.AppThemeCustom) {
                    theme = R.style.AppThemeCustom;
                    activity.recreate();
                }
                break;

            default:
                break;
        }
    }
}
