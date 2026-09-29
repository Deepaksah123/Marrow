package kotlin;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import kotlin.PaymentAuthorizationResult;
import kotlin.getBody;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes4.dex */
public final class getColumns extends RecyclerView.onMediaButtonEvent {
    private final HlsMediaPlaylistPart AudioAttributesCompatParcelizer;
    private CountDownTimer IconCompatParcelizer;
    private final PaymentAuthorizationResult.RemoteActionCompatParcelizer read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getColumns(HlsMediaPlaylistPart hlsMediaPlaylistPart, PaymentAuthorizationResult.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(hlsMediaPlaylistPart.IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(hlsMediaPlaylistPart, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = hlsMediaPlaylistPart;
        this.read = remoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(getBody.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, boolean z) throws Throwable {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatItemReceiver, "");
        AudioAttributesImplApi21Parcelizer();
        final getBigEndianInt getbigendianintIconCompatParcelizer = mediaBrowserCompatItemReceiver.IconCompatParcelizer();
        HlsMediaPlaylistPart hlsMediaPlaylistPart = this.AudioAttributesCompatParcelizer;
        hlsMediaPlaylistPart.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.LabelValueRowBuilder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getColumns.read(this.read, getbigendianintIconCompatParcelizer);
            }
        });
        hlsMediaPlaylistPart.MediaBrowserCompatSearchResultReceiver.setText(PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(getbigendianintIconCompatParcelizer.getIconCompatParcelizer()));
        boolean z2 = getbigendianintIconCompatParcelizer.getAudioAttributesImplApi21Parcelizer() == 0;
        int mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getbigendianintIconCompatParcelizer.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        String str = updateShuffleButton.INSTANCE.read(getbigendianintIconCompatParcelizer.getRemoteActionCompatParcelizer());
        boolean z3 = getbigendianintIconCompatParcelizer.getAudioAttributesImplApi21Parcelizer() == 1;
        ConstraintLayout constraintLayout = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        constraintLayout.setVisibility(getbigendianintIconCompatParcelizer.getOnCustomAction() ? 0 : 8);
        TextView textView = hlsMediaPlaylistPart.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        textView.setVisibility(getbigendianintIconCompatParcelizer.getOnCustomAction() ? 0 : 8);
        int onAddQueueItem = getbigendianintIconCompatParcelizer.getOnAddQueueItem();
        if (onAddQueueItem == 1) {
            RemoteActionCompatParcelizer(getbigendianintIconCompatParcelizer, z2, z3, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, str, z);
        } else if (onAddQueueItem == 2) {
            AudioAttributesCompatParcelizer(getbigendianintIconCompatParcelizer, z2, z3, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, str, z);
        } else {
            if (onAddQueueItem != 3) {
                return;
            }
            read(getbigendianintIconCompatParcelizer, z, str, mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(getColumns getcolumns, getBigEndianInt getbigendianint) {
        getcolumns.read.read(getbigendianint);
    }

    private final void MediaDescriptionCompat() {
        LinearLayout linearLayout = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
    }

    private final void read() {
        LinearLayout linearLayout = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        ImageView imageView = this.AudioAttributesCompatParcelizer.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
    }

    private final void write() {
        ImageView imageView = this.AudioAttributesCompatParcelizer.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(imageView);
    }

    private final void MediaBrowserCompatMediaItem() {
        HlsMediaPlaylistPart hlsMediaPlaylistPart = this.AudioAttributesCompatParcelizer;
        hlsMediaPlaylistPart.read.setBackgroundResource(R.drawable.icv_test_status_upcoming);
        ImageView imageView = hlsMediaPlaylistPart.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
        hlsMediaPlaylistPart.AudioAttributesCompatParcelizer.setAlpha(0.6f);
        MaterialCardView materialCardView = hlsMediaPlaylistPart.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(this.itemView.getContext(), "");
        materialCardView.setElevation(updateNavigation.read(r4, 0));
    }

    private final void AudioAttributesImplBaseParcelizer() {
        HlsMediaPlaylistPart hlsMediaPlaylistPart = this.AudioAttributesCompatParcelizer;
        ImageView imageView = hlsMediaPlaylistPart.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView);
        LottieAnimationView lottieAnimationView = hlsMediaPlaylistPart.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lottieAnimationView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(lottieAnimationView);
        LinearLayout linearLayout = hlsMediaPlaylistPart.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
    }

    private final void IconCompatParcelizer() {
        HlsMediaPlaylistPart hlsMediaPlaylistPart = this.AudioAttributesCompatParcelizer;
        LottieAnimationView lottieAnimationView = hlsMediaPlaylistPart.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lottieAnimationView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(lottieAnimationView);
        LinearLayout linearLayout = hlsMediaPlaylistPart.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        TextView textView = this.AudioAttributesCompatParcelizer.RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
    }

    private final void write(int i) {
        String string;
        LinearLayout linearLayout = this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
        if (i > 0) {
            string = String.valueOf(i);
        } else {
            string = this.itemView.getContext().getString(R.string.label_na);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        }
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer.setText(string);
    }

    private final void read(int i) {
        String string;
        LinearLayout linearLayout = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
        if (i > 0) {
            string = String.valueOf(i);
        } else {
            string = this.itemView.getContext().getString(R.string.label_na);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        }
        this.AudioAttributesCompatParcelizer.MediaMetadataCompat.setText(string);
    }

    private final void RemoteActionCompatParcelizer() {
        LinearLayout linearLayout = this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
    }

    private final void MediaBrowserCompatItemReceiver() {
        LinearLayout linearLayout = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
    }

    private final void read(getBigEndianInt getbigendianint, boolean z, String str, int i) {
        String str2 = dispatchTouchEvent.read(getbigendianint.getAudioAttributesImplApi26Parcelizer(), 2);
        String strConcat = !getbigendianint.getOnCustomAction() ? " • ".concat(String.valueOf(this.itemView.getContext().getString(R.string.label_test_question_third_card_info, str, Integer.valueOf(i)))) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(strConcat);
        String string = sb.toString();
        this.AudioAttributesCompatParcelizer.MediaDescriptionCompat.setText(this.itemView.getContext().getString(R.string.label_test_question_third_card_info, str, Integer.valueOf(i)));
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem.setText(string);
        MaterialCardView materialCardView = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context context = this.itemView.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        materialCardView.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context, R.attr.colorSurface, new TypedValue(), true));
        TextView textView = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        Context context2 = this.itemView.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
        textView.setTextColor(shouldEscapeCharacter.Companion.read(context2, R.attr.colorOnSurface, new TypedValue(), true));
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setStrokeWidth(setObjectType.read(0));
        TextView textView2 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
        MediaBrowserCompatMediaItem();
        IconCompatParcelizer();
        MediaBrowserCompatItemReceiver();
        RemoteActionCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesCompatParcelizer(getbigendianint, z);
    }

    private final void AudioAttributesCompatParcelizer(getBigEndianInt getbigendianint, boolean z, boolean z2, int i, String str, boolean z3) {
        int audioAttributesImplBaseParcelizer = getbigendianint.getAudioAttributesImplBaseParcelizer();
        boolean z4 = getbigendianint.getHandleMediaPlayPauseIfPendingOnHandler() > getbigendianint.getMediaBrowserCompatSearchResultReceiver();
        IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setAlpha(1.0f);
        MaterialCardView materialCardView = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(this.itemView.getContext(), "");
        materialCardView.setElevation(updateNavigation.read(r5, 1));
        if (z) {
            this.AudioAttributesCompatParcelizer.read.setBackgroundResource(R.drawable.icv_test_status_skipped);
            MaterialCardView materialCardView2 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            materialCardView2.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context, R.attr.colorSurface, new TypedValue(), true));
            TextView textView = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
            shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
            Context context2 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
            textView.setTextColor(shouldEscapeCharacter.Companion.read(context2, R.attr.colorOnSurface, new TypedValue(), true));
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setStrokeWidth(setObjectType.read(0));
            ImageView imageView = this.AudioAttributesCompatParcelizer.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
            String str2 = dispatchTouchEvent.read(getbigendianint.getMediaBrowserCompatSearchResultReceiver(), 4);
            String strConcat = !getbigendianint.getOnCustomAction() ? " • ".concat(String.valueOf(this.itemView.getContext().getString(R.string.label_test_question_third_card_info, str, Integer.valueOf(i)))) : "";
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(strConcat);
            String string = sb.toString();
            TextView textView2 = this.AudioAttributesCompatParcelizer.MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            textView2.setVisibility(getbigendianint.getOnCustomAction() ? 0 : 8);
            this.AudioAttributesCompatParcelizer.MediaDescriptionCompat.setText(this.itemView.getContext().getString(R.string.label_test_question_third_card_info, str, Integer.valueOf(i)));
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem.setText(string);
            TextView textView3 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView3);
            MediaBrowserCompatItemReceiver();
            RemoteActionCompatParcelizer();
            MediaBrowserCompatCustomActionResultReceiver();
            AudioAttributesCompatParcelizer(getbigendianint, z3);
            return;
        }
        if (z2) {
            this.AudioAttributesCompatParcelizer.read.setBackgroundResource(R.drawable.icv_test_status_pause);
            MaterialCardView materialCardView3 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
            Context context3 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context3, "");
            materialCardView3.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context3, R.attr.colorSurface, new TypedValue(), true));
            TextView textView4 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
            shouldEscapeCharacter.Companion companion4 = shouldEscapeCharacter.INSTANCE;
            Context context4 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context4, "");
            textView4.setTextColor(shouldEscapeCharacter.Companion.read(context4, R.attr.colorOnSurface, new TypedValue(), true));
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setStrokeWidth(setObjectType.read(0));
            ImageView imageView2 = this.AudioAttributesCompatParcelizer.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(imageView2);
            TextView textView5 = this.AudioAttributesCompatParcelizer.MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView5);
            MediaBrowserCompatItemReceiver();
            RemoteActionCompatParcelizer();
            read();
            write();
            read(getbigendianint);
            return;
        }
        this.AudioAttributesCompatParcelizer.read.setBackgroundResource(R.drawable.icv_test_status_complete);
        if (audioAttributesImplBaseParcelizer != -2) {
            MaterialCardView materialCardView4 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion5 = shouldEscapeCharacter.INSTANCE;
            Context context5 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context5, "");
            materialCardView4.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context5, R.attr.colorSurfaceVariant18, new TypedValue(), true));
            MaterialCardView materialCardView5 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion6 = shouldEscapeCharacter.INSTANCE;
            Context context6 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context6, "");
            materialCardView5.setStrokeColor(shouldEscapeCharacter.Companion.read(context6, R.attr.onSurfaceBgOutline3, new TypedValue(), true));
            TextView textView6 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
            shouldEscapeCharacter.Companion companion7 = shouldEscapeCharacter.INSTANCE;
            Context context7 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context7, "");
            textView6.setTextColor(shouldEscapeCharacter.Companion.read(context7, R.attr.onBackgroundSurface6, new TypedValue(), true));
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setStrokeWidth(setObjectType.read(1));
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem.setText(dispatchTouchEvent.read(getbigendianint.getRatingCompat(), 5));
        } else {
            MaterialCardView materialCardView6 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion8 = shouldEscapeCharacter.INSTANCE;
            Context context8 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context8, "");
            materialCardView6.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context8, R.attr.colorSurface, new TypedValue(), true));
            TextView textView7 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
            shouldEscapeCharacter.Companion companion9 = shouldEscapeCharacter.INSTANCE;
            Context context9 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context9, "");
            textView7.setTextColor(shouldEscapeCharacter.Companion.read(context9, R.attr.colorOnSurface, new TypedValue(), true));
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setStrokeWidth(setObjectType.read(0));
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem.setText(dispatchTouchEvent.read(getbigendianint.getRatingCompat(), -2));
        }
        TextView textView8 = this.AudioAttributesCompatParcelizer.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView8, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView8);
        ImageView imageView3 = this.AudioAttributesCompatParcelizer.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView3);
        if (z4) {
            write(audioAttributesImplBaseParcelizer);
            MediaBrowserCompatItemReceiver();
        } else {
            read(audioAttributesImplBaseParcelizer);
            RemoteActionCompatParcelizer();
        }
        TextView textView9 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView9, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView9);
        write();
        read();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void RemoteActionCompatParcelizer(getBigEndianInt getbigendianint, boolean z, boolean z2, int i, String str, boolean z3) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setAlpha(1.0f);
        MaterialCardView materialCardView = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(this.itemView.getContext(), "");
        materialCardView.setElevation(updateNavigation.read(r1, 1));
        if (z) {
            this.AudioAttributesCompatParcelizer.read.setBackgroundResource(R.drawable.icv_test_status_skipped);
            MaterialCardView materialCardView2 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            materialCardView2.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context, R.attr.colorSurfaceVariant19, new TypedValue(), true));
            MaterialCardView materialCardView3 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
            Context context2 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
            materialCardView3.setStrokeColor(shouldEscapeCharacter.Companion.read(context2, R.attr.onSurfaceBgOutline4, new TypedValue(), true));
            TextView textView = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
            shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
            Context context3 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context3, "");
            textView.setTextColor(shouldEscapeCharacter.Companion.read(context3, R.attr.onBackgroundSurface7, new TypedValue(), true));
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setStrokeWidth(setObjectType.read(1));
            String str2 = dispatchTouchEvent.read(getbigendianint.getMediaBrowserCompatSearchResultReceiver(), 1);
            String strConcat = !getbigendianint.getOnCustomAction() ? " • ".concat(String.valueOf(this.itemView.getContext().getString(R.string.label_test_question_third_card_info, str, Integer.valueOf(i)))) : "";
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(strConcat);
            String string = sb.toString();
            this.AudioAttributesCompatParcelizer.MediaDescriptionCompat.setText(this.itemView.getContext().getString(R.string.label_test_question_third_card_info, str, Integer.valueOf(i)));
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem.setText(string);
            TextView textView2 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
            TextView textView3 = this.AudioAttributesCompatParcelizer.MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            textView3.setVisibility(getbigendianint.getOnCustomAction() ? 0 : 8);
            AudioAttributesImplBaseParcelizer();
            MediaBrowserCompatItemReceiver();
            RemoteActionCompatParcelizer();
            MediaBrowserCompatCustomActionResultReceiver();
            AudioAttributesCompatParcelizer(getbigendianint, z3);
            return;
        }
        if (z2) {
            this.AudioAttributesCompatParcelizer.read.setBackgroundResource(R.drawable.icv_test_status_pause);
            ImageView imageView = this.AudioAttributesCompatParcelizer.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
            MaterialCardView materialCardView4 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion4 = shouldEscapeCharacter.INSTANCE;
            Context context4 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context4, "");
            materialCardView4.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context4, R.attr.colorSurface, new TypedValue(), true));
            TextView textView4 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
            shouldEscapeCharacter.Companion companion5 = shouldEscapeCharacter.INSTANCE;
            Context context5 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context5, "");
            textView4.setTextColor(shouldEscapeCharacter.Companion.read(context5, R.attr.colorOnSurface, new TypedValue(), true));
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setStrokeWidth(setObjectType.read(0));
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem.setText(dispatchTouchEvent.read(getbigendianint.getAudioAttributesImplApi26Parcelizer(), 6));
            TextView textView5 = this.AudioAttributesCompatParcelizer.MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView5);
            TextView textView6 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView6, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView6);
            LinearLayout linearLayout = this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
            MediaBrowserCompatItemReceiver();
            IconCompatParcelizer();
            RemoteActionCompatParcelizer();
            write();
            read();
            read(getbigendianint);
            return;
        }
        this.AudioAttributesCompatParcelizer.read.setBackgroundResource(R.drawable.icv_test_status_complete);
        ImageView imageView2 = this.AudioAttributesCompatParcelizer.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView2);
        IconCompatParcelizer();
        if (getbigendianint.getAudioAttributesImplBaseParcelizer() != -2) {
            MaterialCardView materialCardView5 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion6 = shouldEscapeCharacter.INSTANCE;
            Context context6 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context6, "");
            materialCardView5.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context6, R.attr.colorSurfaceVariant18, new TypedValue(), true));
            MaterialCardView materialCardView6 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion7 = shouldEscapeCharacter.INSTANCE;
            Context context7 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context7, "");
            materialCardView6.setStrokeColor(shouldEscapeCharacter.Companion.read(context7, R.attr.onSurfaceBgOutline3, new TypedValue(), true));
            TextView textView7 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
            shouldEscapeCharacter.Companion companion8 = shouldEscapeCharacter.INSTANCE;
            Context context8 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context8, "");
            textView7.setTextColor(shouldEscapeCharacter.Companion.read(context8, R.attr.onBackgroundSurface6, new TypedValue(), true));
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setStrokeWidth(setObjectType.read(1));
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem.setText(dispatchTouchEvent.read(getbigendianint.getMediaBrowserCompatSearchResultReceiver(), 3));
            RemoteActionCompatParcelizer();
        } else {
            MaterialCardView materialCardView7 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            shouldEscapeCharacter.Companion companion9 = shouldEscapeCharacter.INSTANCE;
            Context context9 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context9, "");
            materialCardView7.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context9, R.attr.colorSurface, new TypedValue(), true));
            TextView textView8 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
            shouldEscapeCharacter.Companion companion10 = shouldEscapeCharacter.INSTANCE;
            Context context10 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context10, "");
            textView8.setTextColor(shouldEscapeCharacter.Companion.read(context10, R.attr.colorOnSurface, new TypedValue(), true));
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setStrokeWidth(setObjectType.read(0));
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem.setText(dispatchTouchEvent.read(getbigendianint.getRatingCompat(), -2));
            write(getbigendianint.getAudioAttributesImplBaseParcelizer());
        }
        TextView textView9 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView9, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView9);
        TextView textView10 = this.AudioAttributesCompatParcelizer.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView10, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView10);
        MediaBrowserCompatItemReceiver();
        read();
        write();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void AudioAttributesCompatParcelizer(getBigEndianInt getbigendianint, boolean z) {
        if (getbigendianint.getMediaBrowserCompatItemReceiver()) {
            MediaDescriptionCompat();
        } else {
            read();
        }
        if (!z && getbigendianint.getMediaBrowserCompatItemReceiver()) {
            AudioAttributesImplApi26Parcelizer();
        } else {
            write();
        }
    }

    private final void read(getBigEndianInt getbigendianint) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = getbigendianint.AudioAttributesImplApi21Parcelizer() < jCurrentTimeMillis;
        MediaBrowserCompatItemReceiver();
        RemoteActionCompatParcelizer();
        TextView textView = this.AudioAttributesCompatParcelizer.RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(textView);
        TextView textView2 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView2);
        if (z) {
            this.AudioAttributesCompatParcelizer.RatingCompat.setText(this.itemView.getContext().getString(R.string.test_time_over));
            return;
        }
        long jAudioAttributesImplApi21Parcelizer = getbigendianint.AudioAttributesImplApi21Parcelizer() - jCurrentTimeMillis;
        if (jAudioAttributesImplApi21Parcelizer > 0) {
            this.IconCompatParcelizer = new read(jAudioAttributesImplApi21Parcelizer, this).start();
        }
    }

    public static final class read extends CountDownTimer {
        private /* synthetic */ getColumns IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(long j, getColumns getcolumns) {
            super(j, 1000L);
            this.IconCompatParcelizer = getcolumns;
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            String strWrite = loadBitmap.write(j);
            String string = this.IconCompatParcelizer.itemView.getContext().getString(R.string.test_time_resume);
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" ");
            sb.append(strWrite);
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer.RatingCompat.setText(sb.toString());
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer.RatingCompat.setText(this.IconCompatParcelizer.itemView.getContext().getString(R.string.test_time_over));
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        AudioAttributesImplApi21Parcelizer();
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CountDownTimer countDownTimer = this.IconCompatParcelizer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.IconCompatParcelizer = null;
    }
}
