package kotlin;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setLayoutParams;", "", "p0", "Lkotlin/Function0;", "Lo/isAbstract;", "p1", "Lo/_handleOddName;", "AudioAttributesCompatParcelizer", "(Lo/setLayoutParams;JLo/getCreatedOnDateMs;)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Predicate2 {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/Predicate2$IconCompatParcelizer;", "Lo/MediaRouteButton;", "Lo/getReferencedType;", "p0", "", "AudioAttributesCompatParcelizer", "(J)V", "IconCompatParcelizer", "()V", "Lo/getModelCountBuiltSoFar;", "p1", "(JLo/getModelCountBuiltSoFar;)V", "write", "RemoteActionCompatParcelizer", "J", "read", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getModelCountBuiltSoFar;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements MediaRouteButton {
        final /* synthetic */ long IconCompatParcelizer;
        final /* synthetic */ setLayoutParams read;
        final /* synthetic */ getCreatedOnDateMs<isAbstract> write;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public long AudioAttributesCompatParcelizer = getReferencedType.INSTANCE.write();

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public long read = getReferencedType.INSTANCE.write();

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        public getModelCountBuiltSoFar RemoteActionCompatParcelizer = getModelCountBuiltSoFar.INSTANCE.read();

        @Override // kotlin.MediaRouteButton
        public final void AudioAttributesCompatParcelizer(long p0) {
        }

        @Override // kotlin.MediaRouteButton
        public final void IconCompatParcelizer() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(getCreatedOnDateMs<? extends isAbstract> getcreatedondatems, setLayoutParams setlayoutparams, long j) {
            this.write = getcreatedondatems;
            this.read = setlayoutparams;
            this.IconCompatParcelizer = j;
        }

        @Override // kotlin.MediaRouteButton
        public final void AudioAttributesCompatParcelizer(long p0, getModelCountBuiltSoFar p1) {
            this.RemoteActionCompatParcelizer = p1;
            isAbstract isabstractInvoke = this.write.invoke();
            if (isabstractInvoke != null) {
                setLayoutParams setlayoutparams = this.read;
                if (!isabstractInvoke.MediaBrowserCompatItemReceiver()) {
                    return;
                }
                setlayoutparams.AudioAttributesCompatParcelizer(isabstractInvoke, p0, this.RemoteActionCompatParcelizer, true);
                this.AudioAttributesCompatParcelizer = p0;
            }
            if (setItemSpacingPx.write(this.read, this.IconCompatParcelizer)) {
                this.read = getReferencedType.INSTANCE.write();
            }
        }

        @Override // kotlin.MediaRouteButton
        public final void IconCompatParcelizer(long p0) {
            isAbstract isabstractInvoke = this.write.invoke();
            if (isabstractInvoke != null) {
                setLayoutParams setlayoutparams = this.read;
                long j = this.IconCompatParcelizer;
                if (isabstractInvoke.MediaBrowserCompatItemReceiver() && setItemSpacingPx.write(setlayoutparams, j)) {
                    long jRemoteActionCompatParcelizer = getReferencedType.RemoteActionCompatParcelizer(this.read, p0);
                    this.read = jRemoteActionCompatParcelizer;
                    long jRemoteActionCompatParcelizer2 = getReferencedType.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, jRemoteActionCompatParcelizer);
                    if (setlayoutparams.IconCompatParcelizer(isabstractInvoke, jRemoteActionCompatParcelizer2, this.AudioAttributesCompatParcelizer, false, this.RemoteActionCompatParcelizer, true)) {
                        this.AudioAttributesCompatParcelizer = jRemoteActionCompatParcelizer2;
                        this.read = getReferencedType.INSTANCE.write();
                    }
                }
            }
        }

        @Override // kotlin.MediaRouteButton
        public final void write() {
            if (setItemSpacingPx.write(this.read, this.IconCompatParcelizer)) {
                this.read.AudioAttributesCompatParcelizer();
            }
        }

        @Override // kotlin.MediaRouteButton
        public final void RemoteActionCompatParcelizer() {
            if (setItemSpacingPx.write(this.read, this.IconCompatParcelizer)) {
                this.read.AudioAttributesCompatParcelizer();
            }
        }
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(setLayoutParams setlayoutparams, long j, getCreatedOnDateMs<? extends isAbstract> getcreatedondatems) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(getcreatedondatems, setlayoutparams, j);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(getcreatedondatems, setlayoutparams, j);
        return hasSomeOfFeatures.IconCompatParcelizer(_handleOddName.INSTANCE, remoteActionCompatParcelizer, iconCompatParcelizer, new read(remoteActionCompatParcelizer, iconCompatParcelizer));
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0005\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/Predicate2$RemoteActionCompatParcelizer;", "Lo/add;", "Lo/getReferencedType;", "p0", "", "AudioAttributesCompatParcelizer", "(J)Z", "IconCompatParcelizer", "Lo/getModelCountBuiltSoFar;", "p1", "", "p2", "(JLo/getModelCountBuiltSoFar;I)Z", "write", "(JLo/getModelCountBuiltSoFar;)Z", "", "()V", "RemoteActionCompatParcelizer", "J", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements add {
        final /* synthetic */ setLayoutParams AudioAttributesCompatParcelizer;
        final /* synthetic */ getCreatedOnDateMs<isAbstract> IconCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        public long read = getReferencedType.INSTANCE.write();
        final /* synthetic */ long write;

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(getCreatedOnDateMs<? extends isAbstract> getcreatedondatems, setLayoutParams setlayoutparams, long j) {
            this.IconCompatParcelizer = getcreatedondatems;
            this.AudioAttributesCompatParcelizer = setlayoutparams;
            this.write = j;
        }

        @Override // kotlin.add
        public final boolean AudioAttributesCompatParcelizer(long p0) {
            isAbstract isabstractInvoke = this.IconCompatParcelizer.invoke();
            if (isabstractInvoke == null) {
                return false;
            }
            setLayoutParams setlayoutparams = this.AudioAttributesCompatParcelizer;
            long j = this.write;
            if (!isabstractInvoke.MediaBrowserCompatItemReceiver()) {
                return false;
            }
            if (setlayoutparams.IconCompatParcelizer(isabstractInvoke, p0, this.read, false, getModelCountBuiltSoFar.INSTANCE.read(), false)) {
                this.read = p0;
            }
            return setItemSpacingPx.write(setlayoutparams, j);
        }

        @Override // kotlin.add
        public final boolean IconCompatParcelizer(long p0) {
            isAbstract isabstractInvoke = this.IconCompatParcelizer.invoke();
            if (isabstractInvoke == null) {
                return true;
            }
            setLayoutParams setlayoutparams = this.AudioAttributesCompatParcelizer;
            long j = this.write;
            if (!isabstractInvoke.MediaBrowserCompatItemReceiver() || !setItemSpacingPx.write(setlayoutparams, j)) {
                return false;
            }
            if (!setlayoutparams.IconCompatParcelizer(isabstractInvoke, p0, this.read, false, getModelCountBuiltSoFar.INSTANCE.read(), false)) {
                return true;
            }
            this.read = p0;
            return true;
        }

        @Override // kotlin.add
        public final boolean AudioAttributesCompatParcelizer(long p0, getModelCountBuiltSoFar p1, int p2) {
            isAbstract isabstractInvoke = this.IconCompatParcelizer.invoke();
            if (isabstractInvoke == null) {
                return false;
            }
            setLayoutParams setlayoutparams = this.AudioAttributesCompatParcelizer;
            long j = this.write;
            if (!isabstractInvoke.MediaBrowserCompatItemReceiver()) {
                return false;
            }
            setlayoutparams.AudioAttributesCompatParcelizer(isabstractInvoke, p0, p1, false);
            this.read = p0;
            return setItemSpacingPx.write(setlayoutparams, j);
        }

        @Override // kotlin.add
        public final boolean write(long p0, getModelCountBuiltSoFar p1) {
            isAbstract isabstractInvoke = this.IconCompatParcelizer.invoke();
            if (isabstractInvoke == null) {
                return true;
            }
            setLayoutParams setlayoutparams = this.AudioAttributesCompatParcelizer;
            long j = this.write;
            if (!isabstractInvoke.MediaBrowserCompatItemReceiver() || !setItemSpacingPx.write(setlayoutparams, j)) {
                return false;
            }
            if (!setlayoutparams.IconCompatParcelizer(isabstractInvoke, p0, this.read, false, p1, false)) {
                return true;
            }
            this.read = p0;
            return true;
        }

        @Override // kotlin.add
        public final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements PointerInputEventHandler {
        final /* synthetic */ RemoteActionCompatParcelizer IconCompatParcelizer;
        final /* synthetic */ IconCompatParcelizer RemoteActionCompatParcelizer;

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(handleBadMerge handlebadmerge, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objIconCompatParcelizer = onAttachedToRecyclerViewInternal.IconCompatParcelizer(handlebadmerge, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }

        read(RemoteActionCompatParcelizer remoteActionCompatParcelizer, IconCompatParcelizer iconCompatParcelizer) {
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        }
    }
}
