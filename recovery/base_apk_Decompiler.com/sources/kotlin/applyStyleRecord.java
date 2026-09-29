package kotlin;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow.ui.activities.learn.video.overlay.VideoTimelineItem;
import java.util.List;
import kotlin.applyStyleRecord;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes5.dex */
public final class applyStyleRecord extends deserializeIymvxus<VideoTimelineItem, write> {
    private final boolean IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final getAnswerMap<VideoTimelineItem, getShowPopup> read;
    private final getAnswerMap<VideoTimelineItem, getShowPopup> write;

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AudioAttributesCompatParcelizer(viewGroup);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public applyStyleRecord(boolean z, boolean z2, getAnswerMap<? super VideoTimelineItem, getShowPopup> getanswermap, getAnswerMap<? super VideoTimelineItem, getShowPopup> getanswermap2) {
        super(new Tx3gDecoder());
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.read = getanswermap;
        this.write = getanswermap2;
    }

    private write AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        r8lambdaoPbzlN0fJ81a0qYQJInalmoAM r8lambdaopbzln0fj81a0qyqjinalmoamRemoteActionCompatParcelizer = r8lambdaoPbzlN0fJ81a0qYQJInalmoAM.RemoteActionCompatParcelizer(LayoutInflater.from(viewGroup.getContext()).cloneInContext(new initializeViewTreeOwners(viewGroup.getContext(), R.style.AppThemeV2_Dark_Dialog)), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8lambdaopbzln0fj81a0qyqjinalmoamRemoteActionCompatParcelizer, "");
        Context context = viewGroup.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        return new write(this, r8lambdaopbzln0fj81a0qyqjinalmoamRemoteActionCompatParcelizer, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(write writeVar, int i) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        VideoTimelineItem videoTimelineItem = read(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(videoTimelineItem, "");
        writeVar.read(videoTimelineItem);
    }

    public final class write extends RecyclerView.onMediaButtonEvent {
        private final r8lambdaoPbzlN0fJ81a0qYQJInalmoAM IconCompatParcelizer;
        private final Context read;
        private /* synthetic */ applyStyleRecord write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(applyStyleRecord applystylerecord, r8lambdaoPbzlN0fJ81a0qYQJInalmoAM r8lambdaopbzln0fj81a0qyqjinalmoam, Context context) {
            super(r8lambdaopbzln0fj81a0qyqjinalmoam.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(r8lambdaopbzln0fj81a0qyqjinalmoam, "");
            toMagicModuleMetaRepoModel.write(context, "");
            this.write = applystylerecord;
            this.IconCompatParcelizer = r8lambdaopbzln0fj81a0qyqjinalmoam;
            this.read = context;
        }

        public final void read(final VideoTimelineItem videoTimelineItem) {
            List<String> pytMcqIds;
            toMagicModuleMetaRepoModel.write(videoTimelineItem, "");
            r8lambdaoPbzlN0fJ81a0qYQJInalmoAM r8lambdaopbzln0fj81a0qyqjinalmoam = this.IconCompatParcelizer;
            final applyStyleRecord applystylerecord = this.write;
            View view = r8lambdaopbzln0fj81a0qyqjinalmoam.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            view.setVisibility(videoTimelineItem.getRead() ? 0 : 8);
            String timelineTitle = videoTimelineItem.getRemoteActionCompatParcelizer().getTimelineTitle();
            r8lambdaopbzln0fj81a0qyqjinalmoam.read.setText(timelineTitle);
            if (applystylerecord.IconCompatParcelizer && (pytMcqIds = videoTimelineItem.getRemoteActionCompatParcelizer().getPytMcqIds()) != null && !pytMcqIds.isEmpty()) {
                TextView textView = r8lambdaopbzln0fj81a0qyqjinalmoam.read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView, timelineTitle);
            }
            boolean zIsUpdateTagVisible = videoTimelineItem.getRemoteActionCompatParcelizer().isUpdateTagVisible();
            CardView cardViewIconCompatParcelizer = r8lambdaopbzln0fj81a0qyqjinalmoam.IconCompatParcelizer.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardViewIconCompatParcelizer, "");
            cardViewIconCompatParcelizer.setVisibility(zIsUpdateTagVisible ? 0 : 8);
            if (zIsUpdateTagVisible) {
                CardView cardViewIconCompatParcelizer2 = r8lambdaopbzln0fj81a0qyqjinalmoam.IconCompatParcelizer.IconCompatParcelizer();
                shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
                cardViewIconCompatParcelizer2.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(this.read, R.attr.colorSurfaceVariant19, new TypedValue(), true));
                TextView textView2 = r8lambdaopbzln0fj81a0qyqjinalmoam.IconCompatParcelizer.read;
                textView2.setText(videoTimelineItem.getRemoteActionCompatParcelizer().getTagLabel());
                toMagicModuleMetaRepoModel.write(textView2);
                bytesRead.read(textView2, R.attr.smallText1);
                shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
                textView2.setTextColor(shouldEscapeCharacter.Companion.read(this.read, R.attr.onBackgroundSurface7, new TypedValue(), true));
            }
            r8lambdaopbzln0fj81a0qyqjinalmoam.write.setText(parseEac3SupplementalProperties.AudioAttributesCompatParcelizer(videoTimelineItem.getRemoteActionCompatParcelizer().getStartTime()));
            TextView textView3 = r8lambdaopbzln0fj81a0qyqjinalmoam.write;
            shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
            textView3.setTextColor(shouldEscapeCharacter.Companion.read(this.read, videoTimelineItem.getRead() ? R.attr.onSurfaceBlue : R.attr.onBackgroundSurface3, new TypedValue(), true));
            if (applystylerecord.RemoteActionCompatParcelizer) {
                ImageView imageView = r8lambdaopbzln0fj81a0qyqjinalmoam.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                PlayerControlViewExternalSyntheticLambda1.read(imageView, videoTimelineItem.RemoteActionCompatParcelizer());
                r8lambdaopbzln0fj81a0qyqjinalmoam.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.assertTrue
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        applyStyleRecord.write.IconCompatParcelizer(applystylerecord, videoTimelineItem);
                    }
                });
            }
            ImageView imageView2 = r8lambdaopbzln0fj81a0qyqjinalmoam.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
            imageView2.setVisibility(applystylerecord.RemoteActionCompatParcelizer ? 0 : 8);
            r8lambdaopbzln0fj81a0qyqjinalmoam.IconCompatParcelizer().setOnClickListener(new View.OnClickListener() { // from class: o.attachColor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    applyStyleRecord.write.read(applystylerecord, videoTimelineItem);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(applyStyleRecord applystylerecord, VideoTimelineItem videoTimelineItem) {
            applystylerecord.write.invoke(videoTimelineItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(applyStyleRecord applystylerecord, VideoTimelineItem videoTimelineItem) {
            applystylerecord.read.invoke(videoTimelineItem);
        }
    }
}
