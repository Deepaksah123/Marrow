package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.slider.Slider;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createExtractorByFileType implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final Slider AudioAttributesImplApi21Parcelizer;
    public final ScrollView AudioAttributesImplApi26Parcelizer;
    public final RadioButton AudioAttributesImplBaseParcelizer;
    public final Button IconCompatParcelizer;
    public final RadioButton MediaBrowserCompatCustomActionResultReceiver;
    public final RadioGroup MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    private CardView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final copyWithEndTag MediaDescriptionCompat;
    public final Spinner MediaMetadataCompat;
    public final View RatingCompat;
    public final LinearLayout RemoteActionCompatParcelizer;
    private CardView handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    public final TextView onCommand;
    private CardView onCustomAction;
    private final LinearLayout onFastForward;
    private RadioGroup onPause;
    private LinearLayout onPlayFromMediaId;
    public final LinearLayout read;
    public final LinearLayout write;

    private createExtractorByFileType(LinearLayout linearLayout, Button button, CardView cardView, CardView cardView2, CardView cardView3, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, RadioGroup radioGroup, RadioGroup radioGroup2, RadioButton radioButton, RadioButton radioButton2, ScrollView scrollView, Slider slider, Spinner spinner, copyWithEndTag copywithendtag, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.onFastForward = linearLayout;
        this.IconCompatParcelizer = button;
        this.handleMediaPlayPauseIfPendingOnHandler = cardView;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = cardView2;
        this.onCustomAction = cardView3;
        this.RemoteActionCompatParcelizer = linearLayout2;
        this.write = linearLayout3;
        this.onPlayFromMediaId = linearLayout4;
        this.read = linearLayout5;
        this.AudioAttributesCompatParcelizer = linearLayout6;
        this.onPause = radioGroup;
        this.MediaBrowserCompatItemReceiver = radioGroup2;
        this.MediaBrowserCompatCustomActionResultReceiver = radioButton;
        this.AudioAttributesImplBaseParcelizer = radioButton2;
        this.AudioAttributesImplApi26Parcelizer = scrollView;
        this.AudioAttributesImplApi21Parcelizer = slider;
        this.MediaMetadataCompat = spinner;
        this.MediaDescriptionCompat = copywithendtag;
        this.RatingCompat = view;
        this.MediaBrowserCompatMediaItem = textView;
        this.MediaBrowserCompatSearchResultReceiver = textView2;
        this.onCommand = textView3;
        this.onAddQueueItem = textView4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.onFastForward;
    }

    public static createExtractorByFileType IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.fragment_custom_module_add_ons_selection, viewGroup, false));
    }

    private static createExtractorByFileType read(View view) {
        int i = R.id.btnNext;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnNext);
        if (button != null) {
            i = R.id.cardDifficultyLevel;
            CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cardDifficultyLevel);
            if (cardView != null) {
                i = R.id.cardQues;
                CardView cardView2 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cardQues);
                if (cardView2 != null) {
                    i = R.id.cardQuesSource;
                    CardView cardView3 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cardQuesSource);
                    if (cardView3 != null) {
                        i = R.id.difficultContainer;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.difficultContainer);
                        if (linearLayout != null) {
                            i = R.id.difficultyLegend;
                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.difficultyLegend);
                            if (linearLayout2 != null) {
                                i = R.id.llNext;
                                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llNext);
                                if (linearLayout3 != null) {
                                    i = R.id.questionContainer;
                                    LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.questionContainer);
                                    if (linearLayout4 != null) {
                                        i = R.id.questionCountContainer;
                                        LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.questionCountContainer);
                                        if (linearLayout5 != null) {
                                            i = R.id.radioGroupDifficultyLevel;
                                            RadioGroup radioGroup = (RadioGroup) getApplicationIcon.IconCompatParcelizer(view, R.id.radioGroupDifficultyLevel);
                                            if (radioGroup != null) {
                                                i = R.id.radioGroupSource;
                                                RadioGroup radioGroup2 = (RadioGroup) getApplicationIcon.IconCompatParcelizer(view, R.id.radioGroupSource);
                                                if (radioGroup2 != null) {
                                                    i = R.id.rbDifficultyAll;
                                                    RadioButton radioButton = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rbDifficultyAll);
                                                    if (radioButton != null) {
                                                        i = R.id.rbDifficultyChoose;
                                                        RadioButton radioButton2 = (RadioButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rbDifficultyChoose);
                                                        if (radioButton2 != null) {
                                                            i = R.id.scrollView;
                                                            ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scrollView);
                                                            if (scrollView != null) {
                                                                i = R.id.slider;
                                                                Slider slider = (Slider) getApplicationIcon.IconCompatParcelizer(view, R.id.slider);
                                                                if (slider != null) {
                                                                    i = R.id.spinnerNumberOfQues;
                                                                    Spinner spinner = (Spinner) getApplicationIcon.IconCompatParcelizer(view, R.id.spinnerNumberOfQues);
                                                                    if (spinner != null) {
                                                                        i = R.id.tooltipCmShare;
                                                                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.tooltipCmShare);
                                                                        if (viewIconCompatParcelizer != null) {
                                                                            copyWithEndTag copywithendtagWrite = copyWithEndTag.write(viewIconCompatParcelizer);
                                                                            i = R.id.tooltipCmShareBackground;
                                                                            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.tooltipCmShareBackground);
                                                                            if (viewIconCompatParcelizer2 != null) {
                                                                                i = R.id.tvDifficultyEasy;
                                                                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDifficultyEasy);
                                                                                if (textView != null) {
                                                                                    i = R.id.tvDifficultyHard;
                                                                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDifficultyHard);
                                                                                    if (textView2 != null) {
                                                                                        i = R.id.tvDifficultyMedium;
                                                                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDifficultyMedium);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.tvShareCmCode;
                                                                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvShareCmCode);
                                                                                            if (textView4 != null) {
                                                                                                return new createExtractorByFileType((LinearLayout) view, button, cardView, cardView2, cardView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, radioGroup, radioGroup2, radioButton, radioButton2, scrollView, slider, spinner, copywithendtagWrite, viewIconCompatParcelizer2, textView, textView2, textView3, textView4);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
