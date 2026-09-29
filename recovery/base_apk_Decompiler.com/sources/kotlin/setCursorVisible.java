package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.marrow.R;
import kotlin.Metadata;
import kotlin.setCursorVisible;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setCursorVisible extends getMediaMetadata<IconCompatParcelizer> {
    public AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    public proceedNonBlocking read;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lo/setCursorVisible$AudioAttributesCompatParcelizer;", "", "Lo/proceedNonBlocking;", "p0", "", "read", "(Lo/proceedNonBlocking;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface AudioAttributesCompatParcelizer {
        void read(proceedNonBlocking p0);
    }

    private proceedNonBlocking MediaDescriptionCompat() {
        proceedNonBlocking proceednonblocking = this.read;
        if (proceednonblocking != null) {
            return proceednonblocking;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    private AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getMediaMetadata
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void read(IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        super.read(iconCompatParcelizer);
        iconCompatParcelizer.write(MediaDescriptionCompat(), MediaBrowserCompatSearchResultReceiver());
    }

    public static final class IconCompatParcelizer extends getCurrentTracks {
        private ProgressBar AudioAttributesCompatParcelizer;
        private TextView AudioAttributesImplApi21Parcelizer;
        private CardView AudioAttributesImplApi26Parcelizer;
        private TextView AudioAttributesImplBaseParcelizer;
        private Context IconCompatParcelizer;
        private ImageView MediaBrowserCompatCustomActionResultReceiver;
        private TextView MediaBrowserCompatItemReceiver;
        private TextView MediaBrowserCompatMediaItem;
        private TextView MediaDescriptionCompat;
        private ShapeableImageView RemoteActionCompatParcelizer;
        private LinearLayout read;
        private LinearLayout write;

        @Override // kotlin.getCurrentTracks
        public final void read(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            Context context = view.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            this.IconCompatParcelizer = context;
            View viewFindViewById = view.findViewById(R.id.ivSubjectIcon);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            this.RemoteActionCompatParcelizer = (ShapeableImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.llSubjectIcon);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            this.write = (LinearLayout) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.llImageBg);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
            this.read = (LinearLayout) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.tvSubjectName);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById4, "");
            this.AudioAttributesImplBaseParcelizer = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.ivCompletionTick);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById5, "");
            this.MediaBrowserCompatCustomActionResultReceiver = (ImageView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.tvSubjectStatus);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById6, "");
            this.MediaBrowserCompatItemReceiver = (TextView) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.pbVideoSubjectProgress);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById7, "");
            this.AudioAttributesCompatParcelizer = (ProgressBar) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.subjectCard);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById8, "");
            this.AudioAttributesImplApi26Parcelizer = (CardView) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(R.id.tv_subject_lesson_new_count);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById9, "");
            this.MediaDescriptionCompat = (TextView) viewFindViewById9;
            View viewFindViewById10 = view.findViewById(R.id.tvAllNewLabel);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById10, "");
            this.AudioAttributesImplApi21Parcelizer = (TextView) viewFindViewById10;
            View viewFindViewById11 = view.findViewById(R.id.tvInteractiveSubjectLabel);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById11, "");
            this.MediaBrowserCompatMediaItem = (TextView) viewFindViewById11;
        }

        private void IconCompatParcelizer(int i, int i2) {
            if (i == i2 && i != 0) {
                AudioAttributesCompatParcelizer(i2);
                return;
            }
            read();
            TextView textView = this.MediaBrowserCompatItemReceiver;
            Context context = null;
            if (textView == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                textView = null;
            }
            Context context2 = this.IconCompatParcelizer;
            if (context2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                context = context2;
            }
            textView.setText(context.getString(R.string.text_subject_subtitle_to_be_filled, Integer.valueOf(i), Integer.valueOf(i2)));
        }

        private void AudioAttributesCompatParcelizer(int i) {
            String string;
            ImageView imageView = this.MediaBrowserCompatCustomActionResultReceiver;
            Context context = null;
            if (imageView == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                imageView = null;
            }
            PlayerControlViewExternalSyntheticLambda1.write(imageView);
            TextView textView = this.MediaBrowserCompatItemReceiver;
            if (textView == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                textView = null;
            }
            if (i == 1) {
                Context context2 = this.IconCompatParcelizer;
                if (context2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    context2 = null;
                }
                string = context2.getString(R.string.subject_completed_one);
            } else {
                Context context3 = this.IconCompatParcelizer;
                if (context3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    context3 = null;
                }
                string = context3.getString(R.string.subject_completed_number, Integer.valueOf(i));
            }
            textView.setText(string);
            LinearLayout linearLayout = this.read;
            if (linearLayout == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                linearLayout = null;
            }
            Context context4 = this.IconCompatParcelizer;
            if (context4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                context4 = null;
            }
            linearLayout.setBackgroundColor(CmcdConfigurationRequestConfig.read(context4, R.attr.colorSurfaceVariant10, R.color.mb_50));
            LinearLayout linearLayout2 = this.write;
            if (linearLayout2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                linearLayout2 = null;
            }
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context5 = this.IconCompatParcelizer;
            if (context5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                context = context5;
            }
            linearLayout2.setBackgroundTintList(ColorStateList.valueOf(shouldEscapeCharacter.Companion.read(context, R.attr.colorSurface, new TypedValue(), true)));
        }

        private void read() {
            ImageView imageView = this.MediaBrowserCompatCustomActionResultReceiver;
            Context context = null;
            if (imageView == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                imageView = null;
            }
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView);
            LinearLayout linearLayout = this.read;
            if (linearLayout == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                linearLayout = null;
            }
            Context context2 = this.IconCompatParcelizer;
            if (context2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                context2 = null;
            }
            linearLayout.setBackgroundColor(CmcdConfigurationRequestConfig.read(context2, R.attr.colorSurfaceVariant3, R.color.mb_50));
            LinearLayout linearLayout2 = this.write;
            if (linearLayout2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                linearLayout2 = null;
            }
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context3 = this.IconCompatParcelizer;
            if (context3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                context = context3;
            }
            linearLayout2.setBackgroundTintList(ColorStateList.valueOf(shouldEscapeCharacter.Companion.read(context, R.attr.colorSurfaceVariant12, new TypedValue(), true)));
        }

        private void RemoteActionCompatParcelizer(String str) {
            Context context = this.IconCompatParcelizer;
            ShapeableImageView shapeableImageView = null;
            if (context == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                context = null;
            }
            createWithPlaceholderTimeline<Drawable> createwithplaceholdertimelineMediaBrowserCompatItemReceiver = setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(context).RemoteActionCompatParcelizer(str).MediaBrowserCompatItemReceiver();
            Context context2 = this.IconCompatParcelizer;
            if (context2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                context2 = null;
            }
            createWithPlaceholderTimeline<Drawable> createwithplaceholdertimelineAudioAttributesCompatParcelizer = createwithplaceholdertimelineMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(_isNaN.getDrawable(context2, R.drawable.ic_marrow_logo_blue));
            Context context3 = this.IconCompatParcelizer;
            if (context3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                context3 = null;
            }
            createWithPlaceholderTimeline<Drawable> createwithplaceholdertimelineIconCompatParcelizer = createwithplaceholdertimelineAudioAttributesCompatParcelizer.IconCompatParcelizer(_isNaN.getDrawable(context3, R.drawable.ic_marrow_logo_blue));
            ShapeableImageView shapeableImageView2 = this.RemoteActionCompatParcelizer;
            if (shapeableImageView2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                shapeableImageView = shapeableImageView2;
            }
            createwithplaceholdertimelineIconCompatParcelizer.RemoteActionCompatParcelizer((ImageView) shapeableImageView);
        }

        public final void write(final proceedNonBlocking proceednonblocking, final AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(proceednonblocking, "");
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            TextView textView = this.AudioAttributesImplBaseParcelizer;
            CardView cardView = null;
            if (textView == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                textView = null;
            }
            textView.setText(proceednonblocking.getAudioAttributesImplApi26Parcelizer());
            IconCompatParcelizer(proceednonblocking.getAudioAttributesCompatParcelizer(), proceednonblocking.getAudioAttributesImplBaseParcelizer());
            RemoteActionCompatParcelizer(proceednonblocking.getWrite());
            ProgressBar progressBar = this.AudioAttributesCompatParcelizer;
            if (progressBar == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                progressBar = null;
            }
            progressBar.setMax(proceednonblocking.getAudioAttributesImplBaseParcelizer());
            ProgressBar progressBar2 = this.AudioAttributesCompatParcelizer;
            if (progressBar2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                progressBar2 = null;
            }
            progressBar2.setProgress(proceednonblocking.getAudioAttributesCompatParcelizer());
            IconCompatParcelizer(proceednonblocking);
            TextView textView2 = this.MediaBrowserCompatMediaItem;
            if (textView2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                textView2 = null;
            }
            textView2.setVisibility(proceednonblocking.getAudioAttributesImplApi21Parcelizer() ? 0 : 8);
            CardView cardView2 = this.AudioAttributesImplApi26Parcelizer;
            if (cardView2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                cardView = cardView2;
            }
            cardView.setOnClickListener(new View.OnClickListener() { // from class: o.ChipTextInputComboView
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setCursorVisible.IconCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, proceednonblocking);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, proceedNonBlocking proceednonblocking) {
            audioAttributesCompatParcelizer.read(proceednonblocking);
        }

        private final void IconCompatParcelizer(proceedNonBlocking proceednonblocking) {
            Context context = null;
            TextView textView = null;
            if (proceednonblocking.getIconCompatParcelizer()) {
                TextView textView2 = this.AudioAttributesImplApi21Parcelizer;
                if (textView2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    textView2 = null;
                }
                PlayerControlViewExternalSyntheticLambda1.write((View) textView2);
                TextView textView3 = this.MediaDescriptionCompat;
                if (textView3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    textView = textView3;
                }
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView);
                return;
            }
            TextView textView4 = this.AudioAttributesImplApi21Parcelizer;
            if (textView4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                textView4 = null;
            }
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView4);
            TextView textView5 = this.MediaDescriptionCompat;
            if (textView5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                textView5 = null;
            }
            textView5.setVisibility(proceednonblocking.getMediaBrowserCompatCustomActionResultReceiver() > 0 ? 0 : 8);
            if (proceednonblocking.getMediaBrowserCompatCustomActionResultReceiver() > 0) {
                TextView textView6 = this.MediaDescriptionCompat;
                if (textView6 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    textView6 = null;
                }
                Context context2 = this.IconCompatParcelizer;
                if (context2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    context = context2;
                }
                textView6.setText(context.getString(R.string.label_subject_new_count, Integer.valueOf(proceednonblocking.getMediaBrowserCompatCustomActionResultReceiver())));
            }
        }
    }
}
