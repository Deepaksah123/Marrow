package kotlin;

import android.content.Context;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.marrow.R;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimelineModel;
import com.marrow.ui.adapter.video.timeline.BookmarkTimelineModelController;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class parseTimestampUs extends getMediaMetadata<IconCompatParcelizer> {
    private boolean AudioAttributesCompatParcelizer;
    public VideoBookmarkTimelineModel RemoteActionCompatParcelizer;
    private boolean read;
    public BookmarkTimelineModelController.AudioAttributesCompatParcelizer write;

    private VideoBookmarkTimelineModel MediaBrowserCompatMediaItem() {
        VideoBookmarkTimelineModel videoBookmarkTimelineModel = this.RemoteActionCompatParcelizer;
        if (videoBookmarkTimelineModel != null) {
            return videoBookmarkTimelineModel;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    private BookmarkTimelineModelController.AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver() {
        BookmarkTimelineModelController.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final boolean MediaDescriptionCompat() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.read = z;
    }

    public final boolean MediaMetadataCompat() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getMediaMetadata
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void read(IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        iconCompatParcelizer.write().setText(MediaBrowserCompatMediaItem().getTimelineTitle());
        iconCompatParcelizer.MediaBrowserCompatItemReceiver().setText(parseEac3SupplementalProperties.write(((long) MediaBrowserCompatMediaItem().getStartTime()) * 1000));
        iconCompatParcelizer.MediaBrowserCompatItemReceiver().setSelected(MediaBrowserCompatMediaItem().getIsSelected());
        TextView textViewMediaBrowserCompatItemReceiver = iconCompatParcelizer.MediaBrowserCompatItemReceiver();
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context context = iconCompatParcelizer.MediaBrowserCompatItemReceiver().getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        textViewMediaBrowserCompatItemReceiver.setTextColor(shouldEscapeCharacter.Companion.read(context, MediaBrowserCompatMediaItem().getIsSelected() ? R.attr.onSurfaceBlue : R.attr.onBackgroundSurface3, new TypedValue(), true));
        iconCompatParcelizer.AudioAttributesCompatParcelizer().setVisibility(MediaBrowserCompatMediaItem().getIsSelected() ? 0 : 8);
        String string = iconCompatParcelizer.read().getContext().getString(R.string.text_lesson_in_subject, MediaBrowserCompatMediaItem().getLessonTitle(), MediaBrowserCompatMediaItem().getSubjectTitle());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        int length = MediaBrowserCompatMediaItem().getLessonTitle().length();
        SpannableString spannableString = new SpannableString(string);
        Context context2 = iconCompatParcelizer.read().getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
        CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context2, R.attr.colorOnBackground, 0, length);
        Context context3 = iconCompatParcelizer.read().getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context3, "");
        String string2 = iconCompatParcelizer.read().getContext().getString(R.string.font_roboto_medium);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        dispatchTouchEvent.read(spannableString, context3, string2, 0, length);
        iconCompatParcelizer.read().setText(spannableString);
        iconCompatParcelizer.IconCompatParcelizer().setVisibility(this.AudioAttributesCompatParcelizer ? 8 : 0);
        PlayerControlViewExternalSyntheticLambda1.read(iconCompatParcelizer.RemoteActionCompatParcelizer(), MediaBrowserCompatMediaItem().getBookmarkType() == 1);
        iconCompatParcelizer.RemoteActionCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.validateWebvttHeaderLine
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                parseTimestampUs.read(this.write);
            }
        });
        iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().setOnClickListener(new View.OnClickListener() { // from class: o.AdaptiveTrackSelection
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                parseTimestampUs.IconCompatParcelizer(this.IconCompatParcelizer);
            }
        });
        if (this.read && MediaBrowserCompatMediaItem().getHasPyt()) {
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(iconCompatParcelizer.write(), iconCompatParcelizer.write().getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(parseTimestampUs parsetimestampus) {
        parsetimestampus.MediaBrowserCompatSearchResultReceiver().RemoteActionCompatParcelizer(parsetimestampus.MediaBrowserCompatMediaItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(parseTimestampUs parsetimestampus) {
        parsetimestampus.MediaBrowserCompatSearchResultReceiver().read(parsetimestampus.MediaBrowserCompatMediaItem());
    }

    public static final class IconCompatParcelizer extends getCurrentTracks {
        private View AudioAttributesCompatParcelizer;
        private View AudioAttributesImplBaseParcelizer;
        private ImageView IconCompatParcelizer;
        private TextView MediaBrowserCompatCustomActionResultReceiver;
        private View RemoteActionCompatParcelizer;
        private TextView read;
        private TextView write;

        private void RemoteActionCompatParcelizer(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            this.AudioAttributesImplBaseParcelizer = view;
        }

        public final View MediaBrowserCompatCustomActionResultReceiver() {
            View view = this.AudioAttributesImplBaseParcelizer;
            if (view != null) {
                return view;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        private void write(TextView textView) {
            toMagicModuleMetaRepoModel.write(textView, "");
            this.MediaBrowserCompatCustomActionResultReceiver = textView;
        }

        public final TextView MediaBrowserCompatItemReceiver() {
            TextView textView = this.MediaBrowserCompatCustomActionResultReceiver;
            if (textView != null) {
                return textView;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        private void RemoteActionCompatParcelizer(TextView textView) {
            toMagicModuleMetaRepoModel.write(textView, "");
            this.read = textView;
        }

        public final TextView read() {
            TextView textView = this.read;
            if (textView != null) {
                return textView;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        private void read(TextView textView) {
            toMagicModuleMetaRepoModel.write(textView, "");
            this.write = textView;
        }

        public final TextView write() {
            TextView textView = this.write;
            if (textView != null) {
                return textView;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        private void IconCompatParcelizer(ImageView imageView) {
            toMagicModuleMetaRepoModel.write(imageView, "");
            this.IconCompatParcelizer = imageView;
        }

        public final ImageView RemoteActionCompatParcelizer() {
            ImageView imageView = this.IconCompatParcelizer;
            if (imageView != null) {
                return imageView;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        private void AudioAttributesCompatParcelizer(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            this.RemoteActionCompatParcelizer = view;
        }

        public final View IconCompatParcelizer() {
            View view = this.RemoteActionCompatParcelizer;
            if (view != null) {
                return view;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        private void write(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            this.AudioAttributesCompatParcelizer = view;
        }

        public final View AudioAttributesCompatParcelizer() {
            View view = this.AudioAttributesCompatParcelizer;
            if (view != null) {
                return view;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        @Override // kotlin.getCurrentTracks
        public final void read(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            View viewFindViewById = view.findViewById(R.id.container);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            RemoteActionCompatParcelizer(viewFindViewById);
            View viewFindViewById2 = view.findViewById(R.id.tv_start_time);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            write((TextView) viewFindViewById2);
            View viewFindViewById3 = view.findViewById(R.id.timeline_title);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
            read((TextView) viewFindViewById3);
            View viewFindViewById4 = view.findViewById(R.id.timeline_subtitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById4, "");
            RemoteActionCompatParcelizer((TextView) viewFindViewById4);
            View viewFindViewById5 = view.findViewById(R.id.btn_bookmark);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById5, "");
            IconCompatParcelizer((ImageView) viewFindViewById5);
            View viewFindViewById6 = view.findViewById(R.id.pro_container);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById6, "");
            AudioAttributesCompatParcelizer(viewFindViewById6);
            View viewFindViewById7 = view.findViewById(R.id.activeTimelineIndicator);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById7, "");
            write(viewFindViewById7);
        }
    }
}
