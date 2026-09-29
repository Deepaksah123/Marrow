package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsChunkSourceHlsMediaPlaylistSegmentIterator implements getApplicationLabel {
    public final CardView AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final Button IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    public final ImageView MediaBrowserCompatMediaItem;
    public final LinearLayout MediaBrowserCompatSearchResultReceiver;
    public final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final LinearLayout MediaDescriptionCompat;
    public final LinearLayout MediaMetadataCompat;
    public final TextView RatingCompat;
    public final setSourceChunk RemoteActionCompatParcelizer;
    public final TextView handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    public final LinearLayout onCommand;
    public final TextView onCustomAction;
    public final initMediaChunkLoad onFastForward;
    public final TextView onMediaButtonEvent;
    public final TextView onPause;
    public final Button onPlay;
    public final Button onPlayFromMediaId;
    public final TextView onPlayFromSearch;
    public final TextView onPlayFromUri;
    private LinearLayout onPrepare;
    public final TextView onPrepareFromMediaId;
    public final TextView onPrepareFromSearch;
    private LinearLayout onPrepareFromUri;
    private TextView onRemoveQueueItem;
    private LinearLayout onRemoveQueueItemAt;
    private TextView onRewind;
    private final LinearLayout onSeekTo;
    public final CardView read;
    public final CardView write;

    private HlsChunkSourceHlsMediaPlaylistSegmentIterator(LinearLayout linearLayout, setSourceChunk setsourcechunk, Button button, CardView cardView, CardView cardView2, CardView cardView3, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, ImageView imageView, LinearLayout linearLayout12, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout13, initMediaChunkLoad initmediachunkload, Button button2, Button button3, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.onSeekTo = linearLayout;
        this.RemoteActionCompatParcelizer = setsourcechunk;
        this.IconCompatParcelizer = button;
        this.write = cardView;
        this.AudioAttributesCompatParcelizer = cardView2;
        this.read = cardView3;
        this.onPrepare = linearLayout2;
        this.AudioAttributesImplApi26Parcelizer = linearLayout3;
        this.onPrepareFromUri = linearLayout4;
        this.MediaBrowserCompatItemReceiver = linearLayout5;
        this.AudioAttributesImplBaseParcelizer = linearLayout6;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout7;
        this.AudioAttributesImplApi21Parcelizer = linearLayout8;
        this.MediaDescriptionCompat = linearLayout9;
        this.MediaMetadataCompat = linearLayout10;
        this.MediaBrowserCompatSearchResultReceiver = linearLayout11;
        this.MediaBrowserCompatMediaItem = imageView;
        this.onRemoveQueueItemAt = linearLayout12;
        this.RatingCompat = textView;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView2;
        this.onCustomAction = textView3;
        this.handleMediaPlayPauseIfPendingOnHandler = textView4;
        this.onAddQueueItem = textView5;
        this.onCommand = linearLayout13;
        this.onFastForward = initmediachunkload;
        this.onPlayFromMediaId = button2;
        this.onPlay = button3;
        this.onMediaButtonEvent = textView6;
        this.onRemoveQueueItem = textView7;
        this.onPause = textView8;
        this.onPlayFromSearch = textView9;
        this.onRewind = textView10;
        this.onPrepareFromMediaId = textView11;
        this.onPlayFromUri = textView12;
        this.onPrepareFromSearch = textView13;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.onSeekTo;
    }

    public static HlsChunkSourceHlsMediaPlaylistSegmentIterator RemoteActionCompatParcelizer(View view) {
        int i = R.id.addressFormContainer;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.addressFormContainer);
        if (viewIconCompatParcelizer != null) {
            setSourceChunk setsourcechunkIconCompatParcelizer = setSourceChunk.IconCompatParcelizer(viewIconCompatParcelizer);
            i = R.id.btnSubmitAddress;
            Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSubmitAddress);
            if (button != null) {
                i = R.id.cvKycDisclaimerContainer;
                CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvKycDisclaimerContainer);
                if (cardView != null) {
                    i = R.id.cvNotesAddressContainer;
                    CardView cardView2 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvNotesAddressContainer);
                    if (cardView2 != null) {
                        i = R.id.desc_card;
                        CardView cardView3 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.desc_card);
                        if (cardView3 != null) {
                            i = R.id.desc_linear_layout;
                            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.desc_linear_layout);
                            if (linearLayout != null) {
                                LinearLayout linearLayout2 = (LinearLayout) view;
                                i = R.id.kyc_linear_layout;
                                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.kyc_linear_layout);
                                if (linearLayout3 != null) {
                                    i = R.id.llNotesDetails;
                                    LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llNotesDetails);
                                    if (linearLayout4 != null) {
                                        i = R.id.llOrderLayoutHeader;
                                        LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llOrderLayoutHeader);
                                        if (linearLayout5 != null) {
                                            i = R.id.llPlanDetails;
                                            LinearLayout linearLayout6 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llPlanDetails);
                                            if (linearLayout6 != null) {
                                                i = R.id.llQbank;
                                                LinearLayout linearLayout7 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llQbank);
                                                if (linearLayout7 != null) {
                                                    i = R.id.llTest;
                                                    LinearLayout linearLayout8 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llTest);
                                                    if (linearLayout8 != null) {
                                                        i = R.id.llVideo;
                                                        LinearLayout linearLayout9 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llVideo);
                                                        if (linearLayout9 != null) {
                                                            i = R.id.order_detail_layout;
                                                            LinearLayout linearLayout10 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.order_detail_layout);
                                                            if (linearLayout10 != null) {
                                                                i = R.id.order_expand_collapse;
                                                                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.order_expand_collapse);
                                                                if (imageView != null) {
                                                                    i = R.id.order_linear_layout;
                                                                    LinearLayout linearLayout11 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.order_linear_layout);
                                                                    if (linearLayout11 != null) {
                                                                        i = R.id.payment_done_note_detail;
                                                                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.payment_done_note_detail);
                                                                        if (textView != null) {
                                                                            i = R.id.payment_done_note_price;
                                                                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.payment_done_note_price);
                                                                            if (textView2 != null) {
                                                                                i = R.id.payment_done_plan_detail;
                                                                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.payment_done_plan_detail);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.payment_done_plan_order_id;
                                                                                    TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.payment_done_plan_order_id);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.payment_done_plan_price;
                                                                                        TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.payment_done_plan_price);
                                                                                        if (textView5 != null) {
                                                                                            i = R.id.plan_desc;
                                                                                            LinearLayout linearLayout12 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.plan_desc);
                                                                                            if (linearLayout12 != null) {
                                                                                                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.queriesLayout);
                                                                                                if (viewIconCompatParcelizer2 != null) {
                                                                                                    initMediaChunkLoad initmediachunkloadAudioAttributesCompatParcelizer = initMediaChunkLoad.AudioAttributesCompatParcelizer(viewIconCompatParcelizer2);
                                                                                                    Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.startKyc);
                                                                                                    if (button2 != null) {
                                                                                                        Button button3 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.start_learning_button);
                                                                                                        if (button3 != null) {
                                                                                                            TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.start_learning_text);
                                                                                                            if (textView6 != null) {
                                                                                                                TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAddAddressFormTitle);
                                                                                                                if (textView7 != null) {
                                                                                                                    TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvKycDisclaimer);
                                                                                                                    if (textView8 != null) {
                                                                                                                        TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvKycDisclaimerDescription);
                                                                                                                        if (textView9 != null) {
                                                                                                                            TextView textView10 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvKycDisclaimerTitle);
                                                                                                                            if (textView10 != null) {
                                                                                                                                TextView textView11 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQbankValidity);
                                                                                                                                if (textView11 != null) {
                                                                                                                                    TextView textView12 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTestValidity);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        TextView textView13 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideosValidity);
                                                                                                                                        if (textView13 != null) {
                                                                                                                                            return new HlsChunkSourceHlsMediaPlaylistSegmentIterator(linearLayout2, setsourcechunkIconCompatParcelizer, button, cardView, cardView2, cardView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, imageView, linearLayout11, textView, textView2, textView3, textView4, textView5, linearLayout12, initmediachunkloadAudioAttributesCompatParcelizer, button2, button3, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
                                                                                                                                        }
                                                                                                                                        i = R.id.tvVideosValidity;
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvTestValidity;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvQbankValidity;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvKycDisclaimerTitle;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvKycDisclaimerDescription;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvKycDisclaimer;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvAddAddressFormTitle;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.start_learning_text;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.start_learning_button;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.startKyc;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.queriesLayout;
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
