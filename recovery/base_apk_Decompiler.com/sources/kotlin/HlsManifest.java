package kotlin;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsManifest implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    public final RadioGroup AudioAttributesImplApi21Parcelizer;
    public final RadioGroup AudioAttributesImplApi26Parcelizer;
    public final CardView AudioAttributesImplBaseParcelizer;
    public final CustomButton IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final HlsSampleStreamWrapper1 MediaBrowserCompatItemReceiver;
    public final ConstraintLayout MediaBrowserCompatMediaItem;
    public final ScrollView MediaBrowserCompatSearchResultReceiver;
    public final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final CardView MediaMetadataCompat;
    private CustomTextView MediaSessionCompatQueueItem;
    private Space MediaSessionCompatResultReceiverWrapper;
    private Space MediaSessionCompatToken;
    private Space ParcelableVolumeInfo;
    private CustomTextView PlaybackStateCompat;
    private CustomTextView PlaybackStateCompatCustomAction;
    public final TextView RatingCompat;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    private TextView ResultReceiver;
    private CustomTextView _init_lambda2;
    private TextView _init_lambda3;
    public final TextView handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    public final CustomTextView onCommand;
    public final TextView onCustomAction;
    public final TextView onFastForward;
    public final TextView onMediaButtonEvent;
    public final CustomTextView onPause;
    public final TextView onPlay;
    public final TextView onPlayFromMediaId;
    public final CustomTextView onPlayFromSearch;
    public final TextView onPlayFromUri;
    public final CustomTextView onPrepare;
    public final TextView onPrepareFromMediaId;
    public final CustomTextView onPrepareFromSearch;
    public final TextView onPrepareFromUri;
    public final CustomTextView onRemoveQueueItem;
    public final TextView onRemoveQueueItemAt;
    public final CustomTextView onRewind;
    public final TextView onSeekTo;
    private LinearLayout onSetCaptioningEnabled;
    public final TextView onSetPlaybackSpeed;
    private AppCompatImageView onSetRating;
    private CustomTextView onSetRepeatMode;
    private AppCompatImageView onSetShuffleMode;
    private ConstraintLayout onSkipToNext;
    private Space onSkipToPrevious;
    private final LinearLayout onSkipToQueueItem;
    private Space onStop;
    private TextView r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private CustomTextView r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private CustomTextView r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private TextView r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private TextView r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    public final ConstraintLayout read;
    private CustomTextView setSessionImpl;
    public final CustomTextView write;

    private HlsManifest(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, CustomButton customButton, CustomTextView customTextView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, CustomTextView customTextView2, LinearLayout linearLayout2, LinearLayout linearLayout3, CardView cardView, HlsSampleStreamWrapper1 hlsSampleStreamWrapper1, ConstraintLayout constraintLayout4, CustomTextView customTextView3, RadioGroup radioGroup, RadioGroup radioGroup2, CardView cardView2, ConstraintLayout constraintLayout5, Space space, Space space2, Space space3, Space space4, Space space5, ScrollView scrollView, CustomTextView customTextView4, CustomTextView customTextView5, CustomTextView customTextView6, CustomTextView customTextView7, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, CustomTextView customTextView8, CustomTextView customTextView9, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, CustomTextView customTextView10, TextView textView12, CustomTextView customTextView11, TextView textView13, CustomTextView customTextView12, TextView textView14, CustomTextView customTextView13, CustomTextView customTextView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, CustomTextView customTextView15, CustomTextView customTextView16, TextView textView21) {
        this.onSkipToQueueItem = linearLayout;
        this.onSetShuffleMode = appCompatImageView;
        this.onSetRating = appCompatImageView2;
        this.IconCompatParcelizer = customButton;
        this.onSetRepeatMode = customTextView;
        this.read = constraintLayout;
        this.RemoteActionCompatParcelizer = constraintLayout2;
        this.AudioAttributesCompatParcelizer = constraintLayout3;
        this.write = customTextView2;
        this.onSetCaptioningEnabled = linearLayout2;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout3;
        this.AudioAttributesImplBaseParcelizer = cardView;
        this.MediaBrowserCompatItemReceiver = hlsSampleStreamWrapper1;
        this.onSkipToNext = constraintLayout4;
        this.setSessionImpl = customTextView3;
        this.AudioAttributesImplApi26Parcelizer = radioGroup;
        this.AudioAttributesImplApi21Parcelizer = radioGroup2;
        this.MediaMetadataCompat = cardView2;
        this.MediaBrowserCompatMediaItem = constraintLayout5;
        this.onSkipToPrevious = space;
        this.onStop = space2;
        this.MediaSessionCompatResultReceiverWrapper = space3;
        this.ParcelableVolumeInfo = space4;
        this.MediaSessionCompatToken = space5;
        this.MediaBrowserCompatSearchResultReceiver = scrollView;
        this.PlaybackStateCompat = customTextView4;
        this.MediaSessionCompatQueueItem = customTextView5;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = customTextView6;
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = customTextView7;
        this.RatingCompat = textView;
        this.MediaDescriptionCompat = textView2;
        this.onAddQueueItem = textView3;
        this.onCustomAction = textView4;
        this.handleMediaPlayPauseIfPendingOnHandler = textView5;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView6;
        this.onCommand = customTextView8;
        this.onPause = customTextView9;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = textView7;
        this.onMediaButtonEvent = textView8;
        this.onPlayFromMediaId = textView9;
        this.onFastForward = textView10;
        this.onPlay = textView11;
        this.PlaybackStateCompatCustomAction = customTextView10;
        this.onPlayFromUri = textView12;
        this.onPrepare = customTextView11;
        this.ResultReceiver = textView13;
        this.onPrepareFromSearch = customTextView12;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = textView14;
        this._init_lambda2 = customTextView13;
        this.onPlayFromSearch = customTextView14;
        this.onPrepareFromMediaId = textView15;
        this.onSeekTo = textView16;
        this.onRemoveQueueItemAt = textView17;
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = textView18;
        this.onPrepareFromUri = textView19;
        this._init_lambda3 = textView20;
        this.onRewind = customTextView15;
        this.onRemoveQueueItem = customTextView16;
        this.onSetPlaybackSpeed = textView21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.onSkipToQueueItem;
    }

    public static HlsManifest IconCompatParcelizer(View view) {
        int i = R.id.appCompatImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.appCompatImageView);
        if (appCompatImageView != null) {
            i = R.id.appCompatImageViewBg;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.appCompatImageViewBg);
            if (appCompatImageView2 != null) {
                i = R.id.btnBuy;
                CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnBuy);
                if (customButton != null) {
                    i = R.id.ccTitle;
                    CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.ccTitle);
                    if (customTextView != null) {
                        i = R.id.clNotesPriceInfo;
                        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clNotesPriceInfo);
                        if (constraintLayout != null) {
                            i = R.id.clPlanDetailsContainer;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clPlanDetailsContainer);
                            if (constraintLayout2 != null) {
                                i = R.id.clPurchaseSummary;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clPurchaseSummary);
                                if (constraintLayout3 != null) {
                                    i = R.id.ctvCouponWarning;
                                    CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.ctvCouponWarning);
                                    if (customTextView2 != null) {
                                        i = R.id.llCouponContainer;
                                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llCouponContainer);
                                        if (linearLayout != null) {
                                            i = R.id.llDescriptionContainer;
                                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llDescriptionContainer);
                                            if (linearLayout2 != null) {
                                                i = R.id.normalCouponContainer;
                                                CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.normalCouponContainer);
                                                if (cardView != null) {
                                                    i = R.id.notes_addon_card;
                                                    View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.notes_addon_card);
                                                    if (viewIconCompatParcelizer != null) {
                                                        HlsSampleStreamWrapper1 hlsSampleStreamWrapper1 = HlsSampleStreamWrapper1.read(viewIconCompatParcelizer);
                                                        i = R.id.plan_detail_buy_button;
                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.plan_detail_buy_button);
                                                        if (constraintLayout4 != null) {
                                                            i = R.id.rcTitle;
                                                            CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.rcTitle);
                                                            if (customTextView3 != null) {
                                                                i = R.id.rdGrpPlanDuration;
                                                                RadioGroup radioGroup = (RadioGroup) getApplicationIcon.IconCompatParcelizer(view, R.id.rdGrpPlanDuration);
                                                                if (radioGroup != null) {
                                                                    i = R.id.rdGrpPlanDurationExtra;
                                                                    RadioGroup radioGroup2 = (RadioGroup) getApplicationIcon.IconCompatParcelizer(view, R.id.rdGrpPlanDurationExtra);
                                                                    if (radioGroup2 != null) {
                                                                        i = R.id.referralCouponContainer;
                                                                        CardView cardView2 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.referralCouponContainer);
                                                                        if (cardView2 != null) {
                                                                            i = R.id.renewBannerLayout;
                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.renewBannerLayout);
                                                                            if (constraintLayout5 != null) {
                                                                                i = R.id.spaceCoupon;
                                                                                Space space = (Space) getApplicationIcon.IconCompatParcelizer(view, R.id.spaceCoupon);
                                                                                if (space != null) {
                                                                                    i = R.id.spcEnd;
                                                                                    Space space2 = (Space) getApplicationIcon.IconCompatParcelizer(view, R.id.spcEnd);
                                                                                    if (space2 != null) {
                                                                                        i = R.id.spcNEEnd;
                                                                                        Space space3 = (Space) getApplicationIcon.IconCompatParcelizer(view, R.id.spcNEEnd);
                                                                                        if (space3 != null) {
                                                                                            i = R.id.spcNEStart;
                                                                                            Space space4 = (Space) getApplicationIcon.IconCompatParcelizer(view, R.id.spcNEStart);
                                                                                            if (space4 != null) {
                                                                                                Space space5 = (Space) getApplicationIcon.IconCompatParcelizer(view, R.id.spcStart);
                                                                                                if (space5 != null) {
                                                                                                    ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.svMain);
                                                                                                    if (scrollView != null) {
                                                                                                        CustomTextView customTextView4 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.textRenew);
                                                                                                        if (customTextView4 != null) {
                                                                                                            CustomTextView customTextView5 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.total_view);
                                                                                                            if (customTextView5 != null) {
                                                                                                                CustomTextView customTextView6 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvApplied);
                                                                                                                if (customTextView6 != null) {
                                                                                                                    CustomTextView customTextView7 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvApplied2);
                                                                                                                    if (customTextView7 != null) {
                                                                                                                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvApplyCoupCode);
                                                                                                                        if (textView != null) {
                                                                                                                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvApplyRefCode);
                                                                                                                            if (textView2 != null) {
                                                                                                                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCGST);
                                                                                                                                if (textView3 != null) {
                                                                                                                                    TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCGSTLabel);
                                                                                                                                    if (textView4 != null) {
                                                                                                                                        TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCouponDiscount);
                                                                                                                                        if (textView5 != null) {
                                                                                                                                            TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCouponDiscountLabel);
                                                                                                                                            if (textView6 != null) {
                                                                                                                                                CustomTextView customTextView8 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCouponView);
                                                                                                                                                if (customTextView8 != null) {
                                                                                                                                                    CustomTextView customTextView9 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFinalPrice);
                                                                                                                                                    if (customTextView9 != null) {
                                                                                                                                                        TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFinalPriceLabel);
                                                                                                                                                        if (textView7 != null) {
                                                                                                                                                            TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvFinalPriceVal);
                                                                                                                                                            if (textView8 != null) {
                                                                                                                                                                TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvKycDisclaimer);
                                                                                                                                                                if (textView9 != null) {
                                                                                                                                                                    TextView textView10 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMarrowE8Label);
                                                                                                                                                                    if (textView10 != null) {
                                                                                                                                                                        TextView textView11 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMarrowNotesLabel);
                                                                                                                                                                        if (textView11 != null) {
                                                                                                                                                                            CustomTextView customTextView10 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNrmlCouponEdit);
                                                                                                                                                                            if (customTextView10 != null) {
                                                                                                                                                                                TextView textView12 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPlan);
                                                                                                                                                                                if (textView12 != null) {
                                                                                                                                                                                    CustomTextView customTextView11 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPlanDuration);
                                                                                                                                                                                    if (customTextView11 != null) {
                                                                                                                                                                                        TextView textView13 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPlanLabel);
                                                                                                                                                                                        if (textView13 != null) {
                                                                                                                                                                                            CustomTextView customTextView12 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPlanTitle);
                                                                                                                                                                                            if (customTextView12 != null) {
                                                                                                                                                                                                TextView textView14 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPurchaseSummary);
                                                                                                                                                                                                if (textView14 != null) {
                                                                                                                                                                                                    CustomTextView customTextView13 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRefCouponEdit);
                                                                                                                                                                                                    if (customTextView13 != null) {
                                                                                                                                                                                                        CustomTextView customTextView14 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRefCouponView);
                                                                                                                                                                                                        if (customTextView14 != null) {
                                                                                                                                                                                                            TextView textView15 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSGST);
                                                                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                                                                TextView textView16 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSGSTLabel);
                                                                                                                                                                                                                if (textView16 != null) {
                                                                                                                                                                                                                    TextView textView17 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvShipping);
                                                                                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                                                                                        TextView textView18 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvShippingLabel);
                                                                                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                                                                                            TextView textView19 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubTotal);
                                                                                                                                                                                                                            if (textView19 != null) {
                                                                                                                                                                                                                                TextView textView20 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubTotalLabel);
                                                                                                                                                                                                                                if (textView20 != null) {
                                                                                                                                                                                                                                    CustomTextView customTextView15 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvViewDetails);
                                                                                                                                                                                                                                    if (customTextView15 != null) {
                                                                                                                                                                                                                                        CustomTextView customTextView16 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvViewMoreDuration);
                                                                                                                                                                                                                                        if (customTextView16 != null) {
                                                                                                                                                                                                                                            TextView textView21 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVpnWarningText);
                                                                                                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                                                                                                return new HlsManifest((LinearLayout) view, appCompatImageView, appCompatImageView2, customButton, customTextView, constraintLayout, constraintLayout2, constraintLayout3, customTextView2, linearLayout, linearLayout2, cardView, hlsSampleStreamWrapper1, constraintLayout4, customTextView3, radioGroup, radioGroup2, cardView2, constraintLayout5, space, space2, space3, space4, space5, scrollView, customTextView4, customTextView5, customTextView6, customTextView7, textView, textView2, textView3, textView4, textView5, textView6, customTextView8, customTextView9, textView7, textView8, textView9, textView10, textView11, customTextView10, textView12, customTextView11, textView13, customTextView12, textView14, customTextView13, customTextView14, textView15, textView16, textView17, textView18, textView19, textView20, customTextView15, customTextView16, textView21);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            i = R.id.tvVpnWarningText;
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                            i = R.id.tvViewMoreDuration;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        i = R.id.tvViewDetails;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    i = R.id.tvSubTotalLabel;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                i = R.id.tvSubTotal;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            i = R.id.tvShippingLabel;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        i = R.id.tvShipping;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    i = R.id.tvSGSTLabel;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                i = R.id.tvSGST;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            i = R.id.tvRefCouponView;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        i = R.id.tvRefCouponEdit;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    i = R.id.tvPurchaseSummary;
                                                                                                                                                                                                }
                                                                                                                                                                                            } else {
                                                                                                                                                                                                i = R.id.tvPlanTitle;
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i = R.id.tvPlanLabel;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i = R.id.tvPlanDuration;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i = R.id.tvPlan;
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                i = R.id.tvNrmlCouponEdit;
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            i = R.id.tvMarrowNotesLabel;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i = R.id.tvMarrowE8Label;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i = R.id.tvKycDisclaimer;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                i = R.id.tvFinalPriceVal;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i = R.id.tvFinalPriceLabel;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.tvFinalPrice;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tvCouponView;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvCouponDiscountLabel;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tvCouponDiscount;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvCGSTLabel;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvCGST;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvApplyRefCode;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvApplyCoupCode;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvApplied2;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvApplied;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.total_view;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.textRenew;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.svMain;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.spcStart;
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
