package com.airbnb.epoxy.stickyheader;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.getCreatedOnDateMs;
import kotlin.getQues;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updatePriorityTaskManagerForIsLoadingChange;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0019KB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\nR\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J#\u0010\u0013\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\nR\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ!\u0010\u0014\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010 J!\u0010\u0016\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0016\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020#H\u0002¢\u0006\u0004\b\u000e\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010&J+\u0010\u0014\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010'2\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010'H\u0016¢\u0006\u0004\b\u0014\u0010(J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010)J5\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u00060\nR\u00020\u000b2\u0006\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010+J#\u0010\u000e\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\nR\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u000e\u0010,J\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b\u0014\u0010.J\u000f\u0010/\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J#\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u001012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0002¢\u0006\u0004\b\u0019\u00103J\u001d\u0010\u0013\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0018\u00010\nR\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u00104J-\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\nR\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0019\u00105J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u00106J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u00107J'\u00108\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00107J-\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\nR\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0016\u00105J\u001d\u0010\u0019\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010'H\u0002¢\u0006\u0004\b\u0019\u00109J\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u00107J#\u0010\u0016\u001a\u00020\r2\n\u0010\u0003\u001a\u00060\nR\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010:R\u0018\u0010\u0013\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010<R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010>R\u0018\u0010\u0016\u001a\u00060?R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010@R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010AR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010AR\u0016\u00108\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010H"}, d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "<init>", "(Landroid/content/Context;IZ)V", "Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View;", "", "write", "(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroid/view/View;I)V", "Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;", "MediaBrowserCompatItemReceiver", "(Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Landroid/graphics/PointF;", "RemoteActionCompatParcelizer", "(I)Landroid/graphics/PointF;", "AudioAttributesImplBaseParcelizer", "read", "(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;I)V", "MediaBrowserCompatSearchResultReceiver", "(I)I", "MediaMetadataCompat", "RatingCompat", "", "(Landroid/view/View;Landroid/view/View;)F", "onPlay", "(Landroid/view/View;)Z", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z", "onPause", "(Landroid/view/View;)V", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V", "(Landroidx/recyclerview/widget/RecyclerView;)V", "p3", "(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)Landroid/view/View;", "(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)V", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "onAddQueueItem", "()Landroid/os/Parcelable;", "T", "Lkotlin/Function0;", "(Lo/getCreatedOnDateMs;)Ljava/lang/Object;", "(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;)V", "(ILandroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Landroidx/recyclerview/widget/RecyclerView$MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;)I", "(I)V", "(II)V", "AudioAttributesImplApi21Parcelizer", "(Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;)V", "(Landroidx/recyclerview/widget/RecyclerView$MediaDescriptionCompat;Z)V", "Lo/updatePriorityTaskManagerForIsLoadingChange;", "Lo/updatePriorityTaskManagerForIsLoadingChange;", "", "Ljava/util/List;", "Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;", "Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$read;", "I", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCommand", "Landroid/view/View;", "handleMediaPlayPauseIfPendingOnHandler", "MediaBrowserCompatCustomActionResultReceiver", "onCustomAction", "F", "onMediaButtonEvent", "AudioAttributesImplApi26Parcelizer", "SavedState"}, k = 1, mv = {1, 4, 2})
public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {
    private updatePriorityTaskManagerForIsLoadingChange AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<Integer> read;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private int write;
    private final read RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private View MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private float AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private float AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()I"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Integer> {
        private /* synthetic */ RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver $read;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(RemoteActionCompatParcelizer());
        }

        public final int RemoteActionCompatParcelizer() {
            return StickyHeaderLinearLayoutManager.super.AudioAttributesImplBaseParcelizer(this.$read);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super(0);
            this.$read = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$10, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "()I"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass10 extends MagicModuleUseCase implements getCreatedOnDateMs<Integer> {
        private /* synthetic */ RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver $write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(IconCompatParcelizer());
        }

        public final int IconCompatParcelizer() {
            return StickyHeaderLinearLayoutManager.super.RemoteActionCompatParcelizer(this.$write);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super(0);
            this.$write = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$13, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()I"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass13 extends MagicModuleUseCase implements getCreatedOnDateMs<Integer> {
        private /* synthetic */ RecyclerView.MediaDescriptionCompat $AudioAttributesCompatParcelizer;
        private /* synthetic */ RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver $RemoteActionCompatParcelizer;
        private /* synthetic */ int $read;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(read());
        }

        public final int read() {
            return StickyHeaderLinearLayoutManager.super.RemoteActionCompatParcelizer(this.$read, this.$AudioAttributesCompatParcelizer, this.$RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass13(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super(0);
            this.$read = i;
            this.$AudioAttributesCompatParcelizer = mediaDescriptionCompat;
            this.$RemoteActionCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "IconCompatParcelizer", "()I"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Integer> {
        private /* synthetic */ RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver $write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(IconCompatParcelizer());
        }

        public final int IconCompatParcelizer() {
            return StickyHeaderLinearLayoutManager.super.IconCompatParcelizer(this.$write);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super(0);
            this.$write = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$4, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()I"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Integer> {
        private /* synthetic */ RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver $write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(RemoteActionCompatParcelizer());
        }

        public final int RemoteActionCompatParcelizer() {
            return StickyHeaderLinearLayoutManager.super.AudioAttributesCompatParcelizer(this.$write);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super(0);
            this.$write = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$5, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()I"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Integer> {
        private /* synthetic */ RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(AudioAttributesCompatParcelizer());
        }

        public final int AudioAttributesCompatParcelizer() {
            return StickyHeaderLinearLayoutManager.super.MediaBrowserCompatItemReceiver(this.$AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super(0);
            this.$AudioAttributesCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$7, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()I"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<Integer> {
        private /* synthetic */ RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(read());
        }

        public final int read() {
            return StickyHeaderLinearLayoutManager.super.read(this.$AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super(0);
            this.$AudioAttributesCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$8, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()I"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<Integer> {
        private /* synthetic */ RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver $AudioAttributesCompatParcelizer;
        private /* synthetic */ int $IconCompatParcelizer;
        private /* synthetic */ RecyclerView.MediaDescriptionCompat $read;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(AudioAttributesCompatParcelizer());
        }

        public final int AudioAttributesCompatParcelizer() {
            return StickyHeaderLinearLayoutManager.super.read(this.$IconCompatParcelizer, this.$read, this.$AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super(0);
            this.$IconCompatParcelizer = i;
            this.$read = mediaDescriptionCompat;
            this.$AudioAttributesCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$9, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass9 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        private /* synthetic */ RecyclerView.MediaDescriptionCompat $IconCompatParcelizer;
        private /* synthetic */ RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer() {
            StickyHeaderLinearLayoutManager.super.write(this.$IconCompatParcelizer, this.$RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super(0);
            this.$IconCompatParcelizer = mediaDescriptionCompat;
            this.$RemoteActionCompatParcelizer = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    public /* synthetic */ StickyHeaderLinearLayoutManager(Context context, int i, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private StickyHeaderLinearLayoutManager(Context context, int i, boolean z) {
        super(i, z);
        toMagicModuleMetaRepoModel.write(context, "");
        this.read = new ArrayList();
        this.RemoteActionCompatParcelizer = new read();
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.write = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.AudioAttributesCompatParcelizer(p0);
        read((RecyclerView.IconCompatParcelizer<?>) p0.IconCompatParcelizer());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(RecyclerView.IconCompatParcelizer<?> p0, RecyclerView.IconCompatParcelizer<?> p1) {
        super.IconCompatParcelizer(p0, p1);
        read(p1);
    }

    private final void read(RecyclerView.IconCompatParcelizer<?> p0) {
        updatePriorityTaskManagerForIsLoadingChange updateprioritytaskmanagerforisloadingchange = this.AudioAttributesCompatParcelizer;
        if (updateprioritytaskmanagerforisloadingchange != null) {
            updateprioritytaskmanagerforisloadingchange.unregisterAdapterDataObserver(this.RemoteActionCompatParcelizer);
        }
        if (p0 instanceof updatePriorityTaskManagerForIsLoadingChange) {
            updatePriorityTaskManagerForIsLoadingChange updateprioritytaskmanagerforisloadingchange2 = (updatePriorityTaskManagerForIsLoadingChange) p0;
            this.AudioAttributesCompatParcelizer = updateprioritytaskmanagerforisloadingchange2;
            if (updateprioritytaskmanagerforisloadingchange2 != null) {
                updateprioritytaskmanagerforisloadingchange2.registerAdapterDataObserver(this.RemoteActionCompatParcelizer);
            }
            this.RemoteActionCompatParcelizer.read();
            return;
        }
        this.AudioAttributesCompatParcelizer = null;
        this.read.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final Parcelable onAddQueueItem() {
        return new SavedState(super.onAddQueueItem(), this.write, this.IconCompatParcelizer);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void IconCompatParcelizer(Parcelable p0) {
        if (!(p0 instanceof SavedState)) {
            p0 = null;
        }
        SavedState savedState = (SavedState) p0;
        if (savedState != null) {
            this.write = savedState.getWrite();
            this.IconCompatParcelizer = savedState.getAudioAttributesCompatParcelizer();
            super.IconCompatParcelizer(savedState.getIconCompatParcelizer());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(int p0, RecyclerView.MediaDescriptionCompat p1, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p2) {
        toMagicModuleMetaRepoModel.write(p1, "");
        int iIntValue = ((Number) read(new AnonymousClass13(p0, p1, p2))).intValue();
        if (iIntValue != 0) {
            RemoteActionCompatParcelizer(p1, false);
        }
        return iIntValue;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int read(int p0, RecyclerView.MediaDescriptionCompat p1, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p2) {
        toMagicModuleMetaRepoModel.write(p1, "");
        int iIntValue = ((Number) read(new AnonymousClass8(p0, p1, p2))).intValue();
        if (iIntValue != 0) {
            RemoteActionCompatParcelizer(p1, false);
        }
        return iIntValue;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void write(RecyclerView.MediaDescriptionCompat p0, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        read(new AnonymousClass9(p0, p1));
        if (p1.write()) {
            return;
        }
        RemoteActionCompatParcelizer(p0, true);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final void read(int p0) {
        read(p0, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void read(int p0, int p1) {
        AudioAttributesImplApi21Parcelizer(p0, p1);
    }

    private final void AudioAttributesImplApi21Parcelizer(int i, int i2) {
        MediaBrowserCompatItemReceiver(-1, Integer.MIN_VALUE);
        int iMediaMetadataCompat = MediaMetadataCompat(i);
        if (iMediaMetadataCompat == -1 || MediaBrowserCompatSearchResultReceiver(i) != -1) {
            super.read(i, i2);
            return;
        }
        int i3 = i - 1;
        if (MediaBrowserCompatSearchResultReceiver(i3) != -1) {
            super.read(i3, i2);
            return;
        }
        if (this.MediaBrowserCompatItemReceiver != null && iMediaMetadataCompat == MediaBrowserCompatSearchResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver)) {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            View view = this.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.write(view);
            super.read(i, i2 + view.getHeight());
            return;
        }
        MediaBrowserCompatItemReceiver(i, i2);
        super.read(i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int AudioAttributesImplBaseParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return ((Number) read(new AnonymousClass1(p0))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return ((Number) read(new AnonymousClass10(p0))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int read(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return ((Number) read(new AnonymousClass7(p0))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int MediaBrowserCompatItemReceiver(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return ((Number) read(new AnonymousClass5(p0))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int AudioAttributesCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return ((Number) read(new AnonymousClass4(p0))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final int IconCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return ((Number) read(new AnonymousClass2(p0))).intValue();
    }

    /* JADX INFO: renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/PointF;", "RemoteActionCompatParcelizer", "()Landroid/graphics/PointF;"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<PointF> {
        private /* synthetic */ int $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final PointF invoke() {
            return StickyHeaderLinearLayoutManager.super.RemoteActionCompatParcelizer(this.$AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i) {
            super(0);
            this.$AudioAttributesCompatParcelizer = i;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.onCustomAction.RemoteActionCompatParcelizer
    public final PointF RemoteActionCompatParcelizer(int p0) {
        return (PointF) read(new AnonymousClass3(p0));
    }

    /* JADX INFO: renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$6, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "AudioAttributesCompatParcelizer", "()Landroid/view/View;"}, k = 3, mv = {1, 4, 2})
    static final class AnonymousClass6 extends MagicModuleUseCase implements getCreatedOnDateMs<View> {
        private /* synthetic */ int $IconCompatParcelizer;
        private /* synthetic */ View $RemoteActionCompatParcelizer;
        private /* synthetic */ RecyclerView.MediaDescriptionCompat $read;
        private /* synthetic */ RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            return StickyHeaderLinearLayoutManager.super.AudioAttributesCompatParcelizer(this.$RemoteActionCompatParcelizer, this.$IconCompatParcelizer, this.$read, this.$write);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(View view, int i, RecyclerView.MediaDescriptionCompat mediaDescriptionCompat, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super(0);
            this.$RemoteActionCompatParcelizer = view;
            this.$IconCompatParcelizer = i;
            this.$read = mediaDescriptionCompat;
            this.$write = mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
    public final View AudioAttributesCompatParcelizer(View p0, int p1, RecyclerView.MediaDescriptionCompat p2, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return (View) read(new AnonymousClass6(p0, p1, p2, p3));
    }

    private final <T> T read(getCreatedOnDateMs<? extends T> p0) {
        View view = this.MediaBrowserCompatItemReceiver;
        if (view != null) {
            a_(view);
        }
        T tInvoke = p0.invoke();
        View view2 = this.MediaBrowserCompatItemReceiver;
        if (view2 != null) {
            read(view2);
        }
        return tInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void RemoteActionCompatParcelizer(androidx.recyclerview.widget.RecyclerView.MediaDescriptionCompat r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.RemoteActionCompatParcelizer(androidx.recyclerview.widget.RecyclerView$MediaDescriptionCompat, boolean):void");
    }

    private final void AudioAttributesCompatParcelizer(RecyclerView.MediaDescriptionCompat p0, int p1) {
        View viewRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer(p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer, "");
        updatePriorityTaskManagerForIsLoadingChange updateprioritytaskmanagerforisloadingchange = this.AudioAttributesCompatParcelizer;
        if (updateprioritytaskmanagerforisloadingchange != null) {
            updateprioritytaskmanagerforisloadingchange.RemoteActionCompatParcelizer(viewRemoteActionCompatParcelizer);
        }
        AudioAttributesCompatParcelizer(viewRemoteActionCompatParcelizer);
        onPause(viewRemoteActionCompatParcelizer);
        onCustomAction(viewRemoteActionCompatParcelizer);
        this.MediaBrowserCompatItemReceiver = viewRemoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = p1;
    }

    private final void write(RecyclerView.MediaDescriptionCompat p0, View p1, int p2) {
        p0.write(p1, p2);
        this.MediaBrowserCompatCustomActionResultReceiver = p2;
        onPause(p1);
        if (this.write != -1) {
            p1.getViewTreeObserver().addOnGlobalLayoutListener(new RemoteActionCompatParcelizer(p1));
        }
    }

    public static final class RemoteActionCompatParcelizer implements ViewTreeObserver.OnGlobalLayoutListener {
        private /* synthetic */ View IconCompatParcelizer;

        RemoteActionCompatParcelizer(View view) {
            this.IconCompatParcelizer = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.IconCompatParcelizer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (StickyHeaderLinearLayoutManager.this.write != -1) {
                StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
                stickyHeaderLinearLayoutManager.read(stickyHeaderLinearLayoutManager.write, StickyHeaderLinearLayoutManager.this.IconCompatParcelizer);
                StickyHeaderLinearLayoutManager.this.MediaBrowserCompatItemReceiver(-1, Integer.MIN_VALUE);
            }
        }
    }

    private final void onPause(View p0) {
        onCommand(p0);
        if (MediaBrowserCompatSearchResultReceiver() == 1) {
            p0.layout(getPaddingLeft(), 0, onPrepare() - getPaddingRight(), p0.getMeasuredHeight());
        } else {
            p0.layout(0, getPaddingTop(), p0.getMeasuredWidth(), onMediaButtonEvent() - getPaddingBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(RecyclerView.MediaDescriptionCompat p0) {
        View view = this.MediaBrowserCompatItemReceiver;
        if (view != null) {
            this.MediaBrowserCompatItemReceiver = null;
            this.MediaBrowserCompatCustomActionResultReceiver = -1;
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            updatePriorityTaskManagerForIsLoadingChange updateprioritytaskmanagerforisloadingchange = this.AudioAttributesCompatParcelizer;
            if (updateprioritytaskmanagerforisloadingchange != null) {
                updateprioritytaskmanagerforisloadingchange.write(view);
            }
            onMediaButtonEvent(view);
            onPlayFromMediaId(view);
            if (p0 != null) {
                p0.write(view);
            }
        }
    }

    private final boolean write(View p0, RecyclerView.LayoutParams p1) {
        if (!p1.Q_() && !p1.R_()) {
            if (MediaBrowserCompatSearchResultReceiver() != 1) {
                return MediaDescriptionCompat() ? ((float) p0.getLeft()) + p0.getTranslationX() <= ((float) onPrepare()) + this.AudioAttributesImplApi21Parcelizer : ((float) p0.getRight()) - p0.getTranslationX() >= this.AudioAttributesImplApi21Parcelizer;
            }
            if (MediaDescriptionCompat()) {
                return ((float) p0.getTop()) + p0.getTranslationY() <= ((float) onMediaButtonEvent()) + this.AudioAttributesImplApi26Parcelizer;
            }
            if (p0.getBottom() - p0.getTranslationY() >= this.AudioAttributesImplApi26Parcelizer) {
                return true;
            }
        }
        return false;
    }

    private final boolean onPlay(View p0) {
        return MediaBrowserCompatSearchResultReceiver() != 1 ? MediaDescriptionCompat() ? ((float) p0.getRight()) - p0.getTranslationX() > ((float) onPrepare()) + this.AudioAttributesImplApi21Parcelizer : ((float) p0.getLeft()) + p0.getTranslationX() < this.AudioAttributesImplApi21Parcelizer : MediaDescriptionCompat() ? ((float) p0.getBottom()) - p0.getTranslationY() > ((float) onMediaButtonEvent()) + this.AudioAttributesImplApi26Parcelizer : ((float) p0.getTop()) + p0.getTranslationY() < this.AudioAttributesImplApi26Parcelizer;
    }

    private final float RemoteActionCompatParcelizer(View p0, View p1) {
        if (MediaBrowserCompatSearchResultReceiver() == 1) {
            boolean zMediaDescriptionCompat = MediaDescriptionCompat();
            float fOnMediaButtonEvent = BitmapDescriptorFactory.HUE_RED;
            if (zMediaDescriptionCompat) {
                fOnMediaButtonEvent = BitmapDescriptorFactory.HUE_RED + (onMediaButtonEvent() - p0.getHeight());
            }
            if (p1 == null) {
                return fOnMediaButtonEvent;
            }
            ViewGroup.LayoutParams layoutParams = p1.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
            ViewGroup.LayoutParams layoutParams2 = p1.getLayoutParams();
            return MediaDescriptionCompat() ? getQues.read(p1.getBottom() + i, fOnMediaButtonEvent) : getQues.write((p1.getTop() - (((ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null)) != null ? r3.topMargin : 0)) - p0.getHeight(), fOnMediaButtonEvent);
        }
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private final float IconCompatParcelizer(View p0, View p1) {
        if (MediaBrowserCompatSearchResultReceiver() == 0) {
            boolean zMediaDescriptionCompat = MediaDescriptionCompat();
            float fOnPrepare = BitmapDescriptorFactory.HUE_RED;
            if (zMediaDescriptionCompat) {
                fOnPrepare = BitmapDescriptorFactory.HUE_RED + (onPrepare() - p0.getWidth());
            }
            if (p1 == null) {
                return fOnPrepare;
            }
            ViewGroup.LayoutParams layoutParams = p1.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
            ViewGroup.LayoutParams layoutParams2 = p1.getLayoutParams();
            return MediaDescriptionCompat() ? getQues.read(p1.getRight() + (((ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null)) != null ? r3.rightMargin : 0), fOnPrepare) : getQues.write((p1.getLeft() - i) - p0.getWidth(), fOnPrepare);
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int MediaBrowserCompatSearchResultReceiver(int p0) {
        int size = this.read.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            if (this.read.get(i2).intValue() > p0) {
                size = i2 - 1;
            } else {
                if (this.read.get(i2).intValue() >= p0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -1;
    }

    private final int MediaMetadataCompat(int p0) {
        int size = this.read.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            if (this.read.get(i2).intValue() <= p0) {
                if (i2 < this.read.size() - 1) {
                    int i3 = i2 + 1;
                    if (this.read.get(i3).intValue() <= p0) {
                        i = i3;
                    }
                }
                return i2;
            }
            size = i2 - 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int RatingCompat(int p0) {
        int size = this.read.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (this.read.get(i3).intValue() >= p0) {
                    size = i3;
                }
            }
            if (this.read.get(i2).intValue() >= p0) {
                return i2;
            }
            i = i2 + 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatItemReceiver(int p0, int p1) {
        this.write = p0;
        this.IconCompatParcelizer = p1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d"}, d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;", "Landroid/os/Parcelable;", "p0", "", "p1", "p2", "<init>", "(Landroid/os/Parcelable;II)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "IconCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write", "read", "Landroid/os/Parcelable;", "()Landroid/os/Parcelable;"}, k = 1, mv = {1, 4, 2})
    public static final /* data */ class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new read();

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final int write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final Parcelable IconCompatParcelizer;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public static final class read implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return read(i);
            }

            private static SavedState AudioAttributesCompatParcelizer(Parcel parcel) {
                toMagicModuleMetaRepoModel.write(parcel, "");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }

            private static SavedState[] read(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            this.IconCompatParcelizer = parcelable;
            this.write = i;
            this.AudioAttributesCompatParcelizer = i2;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final Parcelable getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final int getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, savedState.IconCompatParcelizer) && this.write == savedState.write && this.AudioAttributesCompatParcelizer == savedState.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            Parcelable parcelable = this.IconCompatParcelizer;
            return ((((parcelable != null ? parcelable.hashCode() : 0) * 31) + this.write) * 31) + this.AudioAttributesCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState(IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", write=");
            sb.append(this.write);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            p0.writeParcelable(this.IconCompatParcelizer, p1);
            p0.writeInt(this.write);
            p0.writeInt(this.AudioAttributesCompatParcelizer);
        }
    }

    final class read extends RecyclerView.read {
        public read() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void read() {
            StickyHeaderLinearLayoutManager.this.read.clear();
            updatePriorityTaskManagerForIsLoadingChange updateprioritytaskmanagerforisloadingchange = StickyHeaderLinearLayoutManager.this.AudioAttributesCompatParcelizer;
            int itemCount = updateprioritytaskmanagerforisloadingchange != null ? updateprioritytaskmanagerforisloadingchange.getItemCount() : 0;
            for (int i = 0; i < itemCount; i++) {
                updatePriorityTaskManagerForIsLoadingChange updateprioritytaskmanagerforisloadingchange2 = StickyHeaderLinearLayoutManager.this.AudioAttributesCompatParcelizer;
                if (updateprioritytaskmanagerforisloadingchange2 != null && updateprioritytaskmanagerforisloadingchange2.RemoteActionCompatParcelizer(i)) {
                    StickyHeaderLinearLayoutManager.this.read.add(Integer.valueOf(i));
                }
            }
            if (StickyHeaderLinearLayoutManager.this.MediaBrowserCompatItemReceiver == null || StickyHeaderLinearLayoutManager.this.read.contains(Integer.valueOf(StickyHeaderLinearLayoutManager.this.MediaBrowserCompatCustomActionResultReceiver))) {
                return;
            }
            StickyHeaderLinearLayoutManager.this.AudioAttributesCompatParcelizer((RecyclerView.MediaDescriptionCompat) null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void AudioAttributesCompatParcelizer(int i, int i2) {
            int size = StickyHeaderLinearLayoutManager.this.read.size();
            if (size > 0) {
                for (int iRatingCompat = StickyHeaderLinearLayoutManager.this.RatingCompat(i); iRatingCompat != -1 && iRatingCompat < size; iRatingCompat++) {
                    StickyHeaderLinearLayoutManager.this.read.set(iRatingCompat, Integer.valueOf(((Number) StickyHeaderLinearLayoutManager.this.read.get(iRatingCompat)).intValue() + i2));
                }
            }
            for (int i3 = i; i3 < i2 + i; i3++) {
                updatePriorityTaskManagerForIsLoadingChange updateprioritytaskmanagerforisloadingchange = StickyHeaderLinearLayoutManager.this.AudioAttributesCompatParcelizer;
                if (updateprioritytaskmanagerforisloadingchange != null && updateprioritytaskmanagerforisloadingchange.RemoteActionCompatParcelizer(i3)) {
                    int iRatingCompat2 = StickyHeaderLinearLayoutManager.this.RatingCompat(i3);
                    if (iRatingCompat2 != -1) {
                        StickyHeaderLinearLayoutManager.this.read.add(iRatingCompat2, Integer.valueOf(i3));
                    } else {
                        StickyHeaderLinearLayoutManager.this.read.add(Integer.valueOf(i3));
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void read(int i, int i2) {
            int size = StickyHeaderLinearLayoutManager.this.read.size();
            if (size > 0) {
                int i3 = i + i2;
                int i4 = i3 - 1;
                if (i4 >= i) {
                    while (true) {
                        int iMediaBrowserCompatSearchResultReceiver = StickyHeaderLinearLayoutManager.this.MediaBrowserCompatSearchResultReceiver(i4);
                        if (iMediaBrowserCompatSearchResultReceiver != -1) {
                            StickyHeaderLinearLayoutManager.this.read.remove(iMediaBrowserCompatSearchResultReceiver);
                            size--;
                        }
                        if (i4 == i) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
                if (StickyHeaderLinearLayoutManager.this.MediaBrowserCompatItemReceiver != null && !StickyHeaderLinearLayoutManager.this.read.contains(Integer.valueOf(StickyHeaderLinearLayoutManager.this.MediaBrowserCompatCustomActionResultReceiver))) {
                    StickyHeaderLinearLayoutManager.this.AudioAttributesCompatParcelizer((RecyclerView.MediaDescriptionCompat) null);
                }
                for (int iRatingCompat = StickyHeaderLinearLayoutManager.this.RatingCompat(i3); iRatingCompat != -1 && iRatingCompat < size; iRatingCompat++) {
                    StickyHeaderLinearLayoutManager.this.read.set(iRatingCompat, Integer.valueOf(((Number) StickyHeaderLinearLayoutManager.this.read.get(iRatingCompat)).intValue() - i2));
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.read
        public final void RemoteActionCompatParcelizer(int i, int i2) {
            int size = StickyHeaderLinearLayoutManager.this.read.size();
            if (size > 0) {
                if (i < i2) {
                    for (int iRatingCompat = StickyHeaderLinearLayoutManager.this.RatingCompat(i); iRatingCompat != -1 && iRatingCompat < size; iRatingCompat++) {
                        int iIntValue = ((Number) StickyHeaderLinearLayoutManager.this.read.get(iRatingCompat)).intValue();
                        if (iIntValue >= i && iIntValue < i + 1) {
                            StickyHeaderLinearLayoutManager.this.read.set(iRatingCompat, Integer.valueOf(iIntValue - (i2 - i)));
                            read(iRatingCompat);
                        } else {
                            if (iIntValue < i + 1 || iIntValue > i2) {
                                return;
                            }
                            StickyHeaderLinearLayoutManager.this.read.set(iRatingCompat, Integer.valueOf(iIntValue - 1));
                            read(iRatingCompat);
                        }
                    }
                    return;
                }
                for (int iRatingCompat2 = StickyHeaderLinearLayoutManager.this.RatingCompat(i2); iRatingCompat2 != -1 && iRatingCompat2 < size; iRatingCompat2++) {
                    int iIntValue2 = ((Number) StickyHeaderLinearLayoutManager.this.read.get(iRatingCompat2)).intValue();
                    if (iIntValue2 >= i && iIntValue2 < i + 1) {
                        StickyHeaderLinearLayoutManager.this.read.set(iRatingCompat2, Integer.valueOf(iIntValue2 + (i2 - i)));
                        read(iRatingCompat2);
                    } else {
                        if (i2 > iIntValue2 || i < iIntValue2) {
                            return;
                        }
                        StickyHeaderLinearLayoutManager.this.read.set(iRatingCompat2, Integer.valueOf(iIntValue2 + 1));
                        read(iRatingCompat2);
                    }
                }
            }
        }

        private final void read(int i) {
            int iIntValue = ((Number) StickyHeaderLinearLayoutManager.this.read.remove(i)).intValue();
            int iRatingCompat = StickyHeaderLinearLayoutManager.this.RatingCompat(iIntValue);
            if (iRatingCompat != -1) {
                StickyHeaderLinearLayoutManager.this.read.add(iRatingCompat, Integer.valueOf(iIntValue));
            } else {
                StickyHeaderLinearLayoutManager.this.read.add(Integer.valueOf(iIntValue));
            }
        }
    }
}
