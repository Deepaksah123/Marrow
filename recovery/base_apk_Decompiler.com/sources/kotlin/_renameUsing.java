package kotlin;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.findSubtypesCheckRepeatedNames;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 \r2\u00020\u0001:\u0004\r\b\u0016\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0010¢\u0006\u0004\b\r\u0010\u000fJ\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0010J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\b\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\b\u0010\u0018J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0010J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001a\u0010\u001cJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u0010J\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\r\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u0013¢\u0006\u0004\b\r\u0010\u001dJ\u001d\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u001eH\u0002¢\u0006\u0004\b\u001a\u0010\u001fJ\u001d\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u001eH\u0002¢\u0006\u0004\b\u0016\u0010\u001fJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u0010J\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020#¢\u0006\u0004\b\r\u0010$J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\b\u0010\u000fJ\u000f\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010\u0010J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010&R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b\u0019\u0010(R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010)R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0016\u0010\b\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010)R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010*"}, d2 = {"Lo/_renameUsing;", "", "Landroid/view/ViewGroup;", "p0", "<init>", "(Landroid/view/ViewGroup;)V", "Lo/_renameUsing$RemoteActionCompatParcelizer;", "", "write", "(Lo/_renameUsing$RemoteActionCompatParcelizer;)V", "", "", "p1", "IconCompatParcelizer", "(Ljava/util/List;Z)V", "(Ljava/util/List;)V", "()V", "Lo/_renameUsing$RemoteActionCompatParcelizer$read;", "Lo/_renameUsing$RemoteActionCompatParcelizer$IconCompatParcelizer;", "Lo/_addSetterMethod;", "p2", "(Lo/_renameUsing$RemoteActionCompatParcelizer$read;Lo/_renameUsing$RemoteActionCompatParcelizer$IconCompatParcelizer;Lo/_addSetterMethod;)V", "AudioAttributesCompatParcelizer", "(Lo/_renameUsing$RemoteActionCompatParcelizer$read;Lo/_addSetterMethod;)V", "(Lo/_addSetterMethod;)V", "RemoteActionCompatParcelizer", "read", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)Lo/_renameUsing$RemoteActionCompatParcelizer;", "(Lo/_addSetterMethod;)Lo/_renameUsing$RemoteActionCompatParcelizer$IconCompatParcelizer;", "", "(Ljava/util/List;)Z", "AudioAttributesImplBaseParcelizer", "()Z", "AudioAttributesImplApi26Parcelizer", "Lo/AudioAttributesImplApi26Parcelizer;", "(Lo/AudioAttributesImplApi26Parcelizer;)V", "AudioAttributesImplApi21Parcelizer", "(Z)V", "Landroid/view/ViewGroup;", "()Landroid/view/ViewGroup;", "Z", "Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class _renameUsing {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;
    private final List<RemoteActionCompatParcelizer> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ViewGroup read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<RemoteActionCompatParcelizer> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[RemoteActionCompatParcelizer.IconCompatParcelizer.values().length];
            try {
                iArr[RemoteActionCompatParcelizer.IconCompatParcelizer.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public abstract void IconCompatParcelizer(List<RemoteActionCompatParcelizer> p0, boolean p1);

    public _renameUsing(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        this.read = viewGroup;
        this.IconCompatParcelizer = new ArrayList();
        this.AudioAttributesImplApi21Parcelizer = new ArrayList();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final ViewGroup getRead() {
        return this.read;
    }

    public final RemoteActionCompatParcelizer.IconCompatParcelizer IconCompatParcelizer(_addSetterMethod p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Fragment fragmentIconCompatParcelizer = p0.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fragmentIconCompatParcelizer, "");
        RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(fragmentIconCompatParcelizer);
        RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizerAudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer2 != null ? RemoteActionCompatParcelizer2.AudioAttributesImplApi26Parcelizer() : null;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = read(fragmentIconCompatParcelizer);
        RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizerAudioAttributesImplApi26Parcelizer2 = remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
        int i = iconCompatParcelizerAudioAttributesImplApi26Parcelizer == null ? -1 : read.RemoteActionCompatParcelizer[iconCompatParcelizerAudioAttributesImplApi26Parcelizer.ordinal()];
        return (i == -1 || i == 1) ? iconCompatParcelizerAudioAttributesImplApi26Parcelizer2 : iconCompatParcelizerAudioAttributesImplApi26Parcelizer;
    }

    private final RemoteActionCompatParcelizer RemoteActionCompatParcelizer(Fragment p0) {
        Object next;
        Iterator<T> it = this.IconCompatParcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) next;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.write(), p0) && !remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                break;
            }
        }
        return (RemoteActionCompatParcelizer) next;
    }

    private final RemoteActionCompatParcelizer read(Fragment p0) {
        Object next;
        Iterator<T> it = this.AudioAttributesImplApi21Parcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) next;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.write(), p0) && !remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                break;
            }
        }
        return (RemoteActionCompatParcelizer) next;
    }

    public final void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer.read p0, _addSetterMethod p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (FragmentManager.write(2)) {
            Objects.toString(p1.IconCompatParcelizer());
        }
        write(p0, RemoteActionCompatParcelizer.IconCompatParcelizer.ADDING, p1);
    }

    public final void RemoteActionCompatParcelizer(_addSetterMethod p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (FragmentManager.write(2)) {
            Objects.toString(p0.IconCompatParcelizer());
        }
        write(RemoteActionCompatParcelizer.read.VISIBLE, RemoteActionCompatParcelizer.IconCompatParcelizer.NONE, p0);
    }

    public final void write(_addSetterMethod p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (FragmentManager.write(2)) {
            Objects.toString(p0.IconCompatParcelizer());
        }
        write(RemoteActionCompatParcelizer.read.GONE, RemoteActionCompatParcelizer.IconCompatParcelizer.NONE, p0);
    }

    public final void AudioAttributesCompatParcelizer(_addSetterMethod p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (FragmentManager.write(2)) {
            Objects.toString(p0.IconCompatParcelizer());
        }
        write(RemoteActionCompatParcelizer.read.REMOVED, RemoteActionCompatParcelizer.IconCompatParcelizer.REMOVING, p0);
    }

    private final void write(RemoteActionCompatParcelizer.read p0, RemoteActionCompatParcelizer.IconCompatParcelizer p1, _addSetterMethod p2) {
        synchronized (this.IconCompatParcelizer) {
            Fragment fragmentIconCompatParcelizer = p2.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fragmentIconCompatParcelizer, "");
            RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(fragmentIconCompatParcelizer);
            if (RemoteActionCompatParcelizer2 == null) {
                if (p2.IconCompatParcelizer().mTransitioning) {
                    Fragment fragmentIconCompatParcelizer2 = p2.IconCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fragmentIconCompatParcelizer2, "");
                    RemoteActionCompatParcelizer2 = read(fragmentIconCompatParcelizer2);
                } else {
                    RemoteActionCompatParcelizer2 = null;
                }
            }
            if (RemoteActionCompatParcelizer2 != null) {
                RemoteActionCompatParcelizer2.write(p0, p1);
                return;
            }
            final AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(p0, p1, p2);
            this.IconCompatParcelizer.add(audioAttributesCompatParcelizer);
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new Runnable() { // from class: o._sortProperties
                @Override // java.lang.Runnable
                public final void run() {
                    _renameUsing.write(this.read, audioAttributesCompatParcelizer);
                }
            });
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new Runnable() { // from class: o.collectAll
                @Override // java.lang.Runnable
                public final void run() {
                    _renameUsing.RemoteActionCompatParcelizer(this.read, audioAttributesCompatParcelizer);
                }
            });
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(_renameUsing _renameusing, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(_renameusing, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        if (_renameusing.IconCompatParcelizer.contains(audioAttributesCompatParcelizer)) {
            RemoteActionCompatParcelizer.read readVar = audioAttributesCompatParcelizer.read();
            View view = audioAttributesCompatParcelizer.write().mView;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            readVar.AudioAttributesCompatParcelizer(view, _renameusing.read);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(_renameUsing _renameusing, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(_renameusing, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        _renameusing.IconCompatParcelizer.remove(audioAttributesCompatParcelizer);
        _renameusing.AudioAttributesImplApi21Parcelizer.remove(audioAttributesCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer(boolean p0) {
        this.AudioAttributesCompatParcelizer = p0;
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerPrevious;
        synchronized (this.IconCompatParcelizer) {
            AudioAttributesImplApi21Parcelizer();
            List<RemoteActionCompatParcelizer> list = this.IconCompatParcelizer;
            ListIterator<RemoteActionCompatParcelizer> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    remoteActionCompatParcelizerPrevious = null;
                    break;
                }
                remoteActionCompatParcelizerPrevious = listIterator.previous();
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = remoteActionCompatParcelizerPrevious;
                RemoteActionCompatParcelizer.read.Companion companion = RemoteActionCompatParcelizer.read.INSTANCE;
                View view = remoteActionCompatParcelizer.write().mView;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                RemoteActionCompatParcelizer.read readVarIconCompatParcelizer = RemoteActionCompatParcelizer.read.Companion.IconCompatParcelizer(view);
                if (remoteActionCompatParcelizer.read() == RemoteActionCompatParcelizer.read.VISIBLE && readVarIconCompatParcelizer != RemoteActionCompatParcelizer.read.VISIBLE) {
                    break;
                }
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizerPrevious;
            Fragment fragmentWrite = remoteActionCompatParcelizer2 != null ? remoteActionCompatParcelizer2.write() : null;
            this.RemoteActionCompatParcelizer = fragmentWrite != null ? fragmentWrite.isPostponed() : false;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return !this.IconCompatParcelizer.isEmpty();
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer) {
            FragmentManager.write(2);
            this.RemoteActionCompatParcelizer = false;
            read();
        }
    }

    public final void read() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        if (!this.read.isAttachedToWindow()) {
            IconCompatParcelizer();
            this.AudioAttributesCompatParcelizer = false;
            return;
        }
        synchronized (this.IconCompatParcelizer) {
            List<RemoteActionCompatParcelizer> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.AudioAttributesImplApi21Parcelizer);
            this.AudioAttributesImplApi21Parcelizer.clear();
            Iterator it = listMediaBrowserCompatItemReceiver.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) it.next();
                if (this.IconCompatParcelizer.isEmpty() || !remoteActionCompatParcelizer.write().mTransitioning) {
                    z = false;
                }
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(z);
            }
            for (RemoteActionCompatParcelizer remoteActionCompatParcelizer2 : listMediaBrowserCompatItemReceiver) {
                if (this.write) {
                    if (FragmentManager.write(2)) {
                        Objects.toString(remoteActionCompatParcelizer2);
                    }
                    remoteActionCompatParcelizer2.RemoteActionCompatParcelizer();
                } else {
                    if (FragmentManager.write(2)) {
                        Objects.toString(remoteActionCompatParcelizer2);
                    }
                    remoteActionCompatParcelizer2.IconCompatParcelizer(this.read);
                }
                this.write = false;
                if (!remoteActionCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver()) {
                    this.AudioAttributesImplApi21Parcelizer.add(remoteActionCompatParcelizer2);
                }
            }
            if (!this.IconCompatParcelizer.isEmpty()) {
                AudioAttributesImplApi21Parcelizer();
                List<RemoteActionCompatParcelizer> listMediaBrowserCompatItemReceiver2 = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.IconCompatParcelizer);
                if (listMediaBrowserCompatItemReceiver2.isEmpty()) {
                    return;
                }
                this.IconCompatParcelizer.clear();
                this.AudioAttributesImplApi21Parcelizer.addAll(listMediaBrowserCompatItemReceiver2);
                FragmentManager.write(2);
                IconCompatParcelizer(listMediaBrowserCompatItemReceiver2, this.AudioAttributesCompatParcelizer);
                boolean z = read(listMediaBrowserCompatItemReceiver2);
                boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver2);
                this.write = zAudioAttributesCompatParcelizer && !z;
                FragmentManager.write(2);
                if (!zAudioAttributesCompatParcelizer) {
                    write(listMediaBrowserCompatItemReceiver2);
                    IconCompatParcelizer(listMediaBrowserCompatItemReceiver2);
                } else if (z) {
                    write(listMediaBrowserCompatItemReceiver2);
                    int size = listMediaBrowserCompatItemReceiver2.size();
                    for (int i = 0; i < size; i++) {
                        write(listMediaBrowserCompatItemReceiver2.get(i));
                    }
                }
                this.AudioAttributesCompatParcelizer = false;
                FragmentManager.write(2);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    private static boolean AudioAttributesCompatParcelizer(List<RemoteActionCompatParcelizer> p0) {
        Iterator<T> it = p0.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!((RemoteActionCompatParcelizer) it.next()).write().mTransitioning) {
                z = false;
            }
        }
        return z;
    }

    private static boolean read(List<RemoteActionCompatParcelizer> p0) {
        boolean z;
        List<RemoteActionCompatParcelizer> list = p0;
        loop0: while (true) {
            z = true;
            for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : list) {
                if (!remoteActionCompatParcelizer.IconCompatParcelizer().isEmpty()) {
                    List<write> listIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer();
                    if (!(listIconCompatParcelizer instanceof Collection) || !listIconCompatParcelizer.isEmpty()) {
                        Iterator<T> it = listIconCompatParcelizer.iterator();
                        while (it.hasNext()) {
                            if (!((write) it.next()).AudioAttributesCompatParcelizer()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) ((RemoteActionCompatParcelizer) it2.next()).IconCompatParcelizer());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void write(RemoteActionCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.AudioAttributesImplBaseParcelizer()) {
            RemoteActionCompatParcelizer.read readVar = p0.read();
            View viewRequireView = p0.write().requireView();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewRequireView, "");
            readVar.AudioAttributesCompatParcelizer(viewRequireView, this.read);
            p0.MediaDescriptionCompat();
        }
    }

    public final void IconCompatParcelizer() {
        FragmentManager.write(2);
        boolean zIsAttachedToWindow = this.read.isAttachedToWindow();
        synchronized (this.IconCompatParcelizer) {
            AudioAttributesImplApi21Parcelizer();
            write(this.IconCompatParcelizer);
            List<RemoteActionCompatParcelizer> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.AudioAttributesImplApi21Parcelizer);
            Iterator it = listMediaBrowserCompatItemReceiver.iterator();
            while (it.hasNext()) {
                ((RemoteActionCompatParcelizer) it.next()).AudioAttributesCompatParcelizer(false);
            }
            for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : listMediaBrowserCompatItemReceiver) {
                if (FragmentManager.write(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.read);
                        sb.append(" is not attached to window. ");
                        sb.toString();
                    }
                    Objects.toString(remoteActionCompatParcelizer);
                }
                remoteActionCompatParcelizer.IconCompatParcelizer(this.read);
            }
            List<RemoteActionCompatParcelizer> listMediaBrowserCompatItemReceiver2 = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.IconCompatParcelizer);
            Iterator it2 = listMediaBrowserCompatItemReceiver2.iterator();
            while (it2.hasNext()) {
                ((RemoteActionCompatParcelizer) it2.next()).AudioAttributesCompatParcelizer(false);
            }
            for (RemoteActionCompatParcelizer remoteActionCompatParcelizer2 : listMediaBrowserCompatItemReceiver2) {
                if (FragmentManager.write(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.read);
                        sb2.append(" is not attached to window. ");
                        sb2.toString();
                    }
                    Objects.toString(remoteActionCompatParcelizer2);
                }
                remoteActionCompatParcelizer2.IconCompatParcelizer(this.read);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.IconCompatParcelizer) {
            if (remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer() == RemoteActionCompatParcelizer.IconCompatParcelizer.ADDING) {
                View viewRequireView = remoteActionCompatParcelizer.write().requireView();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewRequireView, "");
                RemoteActionCompatParcelizer.read.Companion companion = RemoteActionCompatParcelizer.read.INSTANCE;
                remoteActionCompatParcelizer.write(RemoteActionCompatParcelizer.read.Companion.IconCompatParcelizer(viewRequireView.getVisibility()), RemoteActionCompatParcelizer.IconCompatParcelizer.NONE);
            }
        }
    }

    private void IconCompatParcelizer(List<RemoteActionCompatParcelizer> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        List<RemoteActionCompatParcelizer> list = p0;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) ((RemoteActionCompatParcelizer) it.next()).IconCompatParcelizer());
        }
        List listOnPlay = IntermediateLoginResponseBody.onPlay(IntermediateLoginResponseBody.onPlayFromUri(arrayList));
        int size = listOnPlay.size();
        for (int i = 0; i < size; i++) {
            ((write) listOnPlay.get(i)).RemoteActionCompatParcelizer(this.read);
        }
        int size2 = p0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            write(p0.get(i2));
        }
        List listOnPlay2 = IntermediateLoginResponseBody.onPlay(list);
        int size3 = listOnPlay2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) listOnPlay2.get(i3);
            if (remoteActionCompatParcelizer.IconCompatParcelizer().isEmpty()) {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
        }
    }

    private final void write(List<RemoteActionCompatParcelizer> p0) {
        int size = p0.size();
        for (int i = 0; i < size; i++) {
            p0.get(i).AudioAttributesCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) ((RemoteActionCompatParcelizer) it.next()).IconCompatParcelizer());
        }
        List listOnPlay = IntermediateLoginResponseBody.onPlay(IntermediateLoginResponseBody.onPlayFromUri(arrayList));
        int size2 = listOnPlay.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((write) listOnPlay.get(i2)).AudioAttributesCompatParcelizer(this.read);
        }
    }

    public final void IconCompatParcelizer(AudioAttributesImplApi26Parcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (FragmentManager.write(2)) {
            p0.getWrite();
        }
        List<RemoteActionCompatParcelizer> list = this.AudioAttributesImplApi21Parcelizer;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) ((RemoteActionCompatParcelizer) it.next()).IconCompatParcelizer());
        }
        List listOnPlay = IntermediateLoginResponseBody.onPlay(IntermediateLoginResponseBody.onPlayFromUri(arrayList));
        int size = listOnPlay.size();
        for (int i = 0; i < size; i++) {
            ((write) listOnPlay.get(i)).RemoteActionCompatParcelizer(p0, this.read);
        }
    }

    public final void write() {
        FragmentManager.write(3);
        write(this.AudioAttributesImplApi21Parcelizer);
        IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
    }

    public static class RemoteActionCompatParcelizer {
        private final List<write> AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private boolean AudioAttributesImplApi26Parcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        private final List<Runnable> IconCompatParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private IconCompatParcelizer MediaBrowserCompatSearchResultReceiver;
        private final Fragment RemoteActionCompatParcelizer;
        private final List<write> read;
        private read write;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/_renameUsing$RemoteActionCompatParcelizer$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "write", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum IconCompatParcelizer {
            NONE,
            ADDING,
            REMOVING
        }

        public final /* synthetic */ class write {
            public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

            static {
                int[] iArr = new int[IconCompatParcelizer.values().length];
                try {
                    iArr[IconCompatParcelizer.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IconCompatParcelizer.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IconCompatParcelizer.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                AudioAttributesCompatParcelizer = iArr;
            }
        }

        public RemoteActionCompatParcelizer(read readVar, IconCompatParcelizer iconCompatParcelizer, Fragment fragment) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(fragment, "");
            this.write = readVar;
            this.MediaBrowserCompatSearchResultReceiver = iconCompatParcelizer;
            this.RemoteActionCompatParcelizer = fragment;
            this.IconCompatParcelizer = new ArrayList();
            this.AudioAttributesImplApi26Parcelizer = true;
            ArrayList arrayList = new ArrayList();
            this.read = arrayList;
            this.AudioAttributesCompatParcelizer = arrayList;
        }

        public final read read() {
            return this.write;
        }

        public final IconCompatParcelizer AudioAttributesImplApi26Parcelizer() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public final Fragment write() {
            return this.RemoteActionCompatParcelizer;
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nj\u0002\b\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lo/_renameUsing$RemoteActionCompatParcelizer$read;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/view/View;", "p0", "Landroid/view/ViewGroup;", "p1", "", "AudioAttributesCompatParcelizer", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "write", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum read {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: write, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: o._renameUsing$RemoteActionCompatParcelizer$read$RemoteActionCompatParcelizer, reason: collision with other inner class name */
            public final /* synthetic */ class C0059RemoteActionCompatParcelizer {
                public static final /* synthetic */ int[] read;

                static {
                    int[] iArr = new int[read.values().length];
                    try {
                        iArr[read.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[read.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[read.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[read.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    read = iArr;
                }
            }

            public final void AudioAttributesCompatParcelizer(View p0, ViewGroup p1) {
                toMagicModuleMetaRepoModel.write(p0, "");
                toMagicModuleMetaRepoModel.write(p1, "");
                int i = C0059RemoteActionCompatParcelizer.read[ordinal()];
                if (i == 1) {
                    ViewParent parent = p0.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.write(2)) {
                            Objects.toString(p0);
                            Objects.toString(viewGroup);
                        }
                        viewGroup.removeView(p0);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.write(2)) {
                        Objects.toString(p0);
                    }
                    ViewParent parent2 = p0.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.write(2)) {
                            Objects.toString(p0);
                            Objects.toString(p1);
                        }
                        p1.addView(p0);
                    }
                    p0.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (FragmentManager.write(2)) {
                        Objects.toString(p0);
                    }
                    p0.setVisibility(8);
                } else if (i == 4) {
                    if (FragmentManager.write(2)) {
                        Objects.toString(p0);
                    }
                    p0.setVisibility(4);
                }
            }

            @getMagicModuleMeta
            public static final read write(int i) {
                return Companion.IconCompatParcelizer(i);
            }

            /* JADX INFO: renamed from: o._renameUsing$RemoteActionCompatParcelizer$read$write, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\t¢\u0006\u0004\b\u0007\u0010\n"}, d2 = {"Lo/_renameUsing$RemoteActionCompatParcelizer$read$write;", "", "<init>", "()V", "", "p0", "Lo/_renameUsing$RemoteActionCompatParcelizer$read;", "IconCompatParcelizer", "(I)Lo/_renameUsing$RemoteActionCompatParcelizer$read;", "Landroid/view/View;", "(Landroid/view/View;)Lo/_renameUsing$RemoteActionCompatParcelizer$read;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public static read IconCompatParcelizer(View view) {
                    toMagicModuleMetaRepoModel.write(view, "");
                    if (view.getAlpha() == BitmapDescriptorFactory.HUE_RED && view.getVisibility() == 0) {
                        return read.INVISIBLE;
                    }
                    return IconCompatParcelizer(view.getVisibility());
                }

                @getMagicModuleMeta
                public static read IconCompatParcelizer(int p0) {
                    if (p0 == 0) {
                        return read.VISIBLE;
                    }
                    if (p0 == 4) {
                        return read.INVISIBLE;
                    }
                    if (p0 == 8) {
                        return read.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility ".concat(String.valueOf(p0)));
                }

                public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                    this();
                }
            }
        }

        public final boolean AudioAttributesImplApi21Parcelizer() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final boolean MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final void AudioAttributesCompatParcelizer(boolean z) {
            this.AudioAttributesImplApi21Parcelizer = z;
        }

        public final boolean MediaBrowserCompatMediaItem() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final boolean AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final void MediaDescriptionCompat() {
            this.AudioAttributesImplApi26Parcelizer = false;
        }

        public final List<write> IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            StringBuilder sb = new StringBuilder("Operation {");
            sb.append(hexString);
            sb.append("} {finalState = ");
            sb.append(this.write);
            sb.append(" lifecycleImpact = ");
            sb.append(this.MediaBrowserCompatSearchResultReceiver);
            sb.append(" fragment = ");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append('}');
            return sb.toString();
        }

        public final void IconCompatParcelizer(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            this.MediaBrowserCompatItemReceiver = false;
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                return;
            }
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            if (this.read.isEmpty()) {
                RemoteActionCompatParcelizer();
                return;
            }
            Iterator it = IntermediateLoginResponseBody.onPlay(this.AudioAttributesCompatParcelizer).iterator();
            while (it.hasNext()) {
                ((write) it.next()).read(viewGroup);
            }
        }

        public final void write(read readVar, IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            int i = write.AudioAttributesCompatParcelizer[iconCompatParcelizer.ordinal()];
            if (i == 1) {
                if (this.write == read.REMOVED) {
                    if (FragmentManager.write(2)) {
                        Objects.toString(this.RemoteActionCompatParcelizer);
                        Objects.toString(this.MediaBrowserCompatSearchResultReceiver);
                    }
                    this.write = read.VISIBLE;
                    this.MediaBrowserCompatSearchResultReceiver = IconCompatParcelizer.ADDING;
                    this.AudioAttributesImplApi26Parcelizer = true;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (FragmentManager.write(2)) {
                    Objects.toString(this.RemoteActionCompatParcelizer);
                    Objects.toString(this.write);
                    Objects.toString(this.MediaBrowserCompatSearchResultReceiver);
                }
                this.write = read.REMOVED;
                this.MediaBrowserCompatSearchResultReceiver = IconCompatParcelizer.REMOVING;
                this.AudioAttributesImplApi26Parcelizer = true;
                return;
            }
            if (i != 3 || this.write == read.REMOVED) {
                return;
            }
            if (FragmentManager.write(2)) {
                Objects.toString(this.RemoteActionCompatParcelizer);
                Objects.toString(this.write);
                Objects.toString(readVar);
            }
            this.write = readVar;
        }

        public final void RemoteActionCompatParcelizer(Runnable runnable) {
            toMagicModuleMetaRepoModel.write(runnable, "");
            this.IconCompatParcelizer.add(runnable);
        }

        public final void write(write writeVar) {
            toMagicModuleMetaRepoModel.write(writeVar, "");
            this.read.add(writeVar);
        }

        public final void RemoteActionCompatParcelizer(write writeVar) {
            toMagicModuleMetaRepoModel.write(writeVar, "");
            if (this.read.remove(writeVar) && this.read.isEmpty()) {
                RemoteActionCompatParcelizer();
            }
        }

        public void AudioAttributesCompatParcelizer() {
            this.MediaBrowserCompatItemReceiver = true;
        }

        public void RemoteActionCompatParcelizer() {
            this.MediaBrowserCompatItemReceiver = false;
            if (this.AudioAttributesImplBaseParcelizer) {
                return;
            }
            if (FragmentManager.write(2)) {
                toString();
            }
            this.AudioAttributesImplBaseParcelizer = true;
            Iterator<T> it = this.IconCompatParcelizer.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    static final class AudioAttributesCompatParcelizer extends RemoteActionCompatParcelizer {
        private final _addSetterMethod write;

        /* JADX WARN: Illegal instructions before constructor call */
        public AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer.read readVar, RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer, _addSetterMethod _addsettermethod) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(_addsettermethod, "");
            Fragment fragmentIconCompatParcelizer = _addsettermethod.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fragmentIconCompatParcelizer, "");
            super(readVar, iconCompatParcelizer, fragmentIconCompatParcelizer);
            this.write = _addsettermethod;
        }

        @Override // o._renameUsing.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            if (MediaBrowserCompatMediaItem()) {
                return;
            }
            super.AudioAttributesCompatParcelizer();
            if (AudioAttributesImplApi26Parcelizer() == RemoteActionCompatParcelizer.IconCompatParcelizer.ADDING) {
                Fragment fragmentIconCompatParcelizer = this.write.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fragmentIconCompatParcelizer, "");
                View viewFindFocus = fragmentIconCompatParcelizer.mView.findFocus();
                if (viewFindFocus != null) {
                    fragmentIconCompatParcelizer.setFocusedView(viewFindFocus);
                    if (FragmentManager.write(2)) {
                        Objects.toString(viewFindFocus);
                        Objects.toString(fragmentIconCompatParcelizer);
                    }
                }
                View viewRequireView = write().requireView();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewRequireView, "");
                if (viewRequireView.getParent() == null) {
                    this.write.write();
                    viewRequireView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                }
                if (viewRequireView.getAlpha() == BitmapDescriptorFactory.HUE_RED && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragmentIconCompatParcelizer.getPostOnViewCreatedAlpha());
                return;
            }
            if (AudioAttributesImplApi26Parcelizer() == RemoteActionCompatParcelizer.IconCompatParcelizer.REMOVING) {
                Fragment fragmentIconCompatParcelizer2 = this.write.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fragmentIconCompatParcelizer2, "");
                View viewRequireView2 = fragmentIconCompatParcelizer2.requireView();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewRequireView2, "");
                if (FragmentManager.write(2)) {
                    Objects.toString(viewRequireView2.findFocus());
                    Objects.toString(viewRequireView2);
                    Objects.toString(fragmentIconCompatParcelizer2);
                }
                viewRequireView2.clearFocus();
            }
        }

        @Override // o._renameUsing.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
            super.RemoteActionCompatParcelizer();
            write().mTransitioning = false;
            this.write.RemoteActionCompatParcelizer();
        }
    }

    public static class write {
        private boolean RemoteActionCompatParcelizer;
        private boolean read;
        private final boolean write;

        public boolean AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final void AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            if (!this.read) {
                write(viewGroup);
            }
            this.read = true;
        }

        public final void read(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            if (!this.RemoteActionCompatParcelizer) {
                IconCompatParcelizer(viewGroup);
            }
            this.RemoteActionCompatParcelizer = true;
        }

        public void IconCompatParcelizer(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
        }

        public void RemoteActionCompatParcelizer(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
        }

        public void RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer, ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
            toMagicModuleMetaRepoModel.write(viewGroup, "");
        }

        public void write(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
        }
    }

    /* JADX INFO: renamed from: o._renameUsing$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/_renameUsing$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "p0", "Landroidx/fragment/app/FragmentManager;", "p1", "Lo/_renameUsing;", "write", "(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Lo/_renameUsing;", "Lo/getAnySetterField;", "read", "(Landroid/view/ViewGroup;Lo/getAnySetterField;)Lo/_renameUsing;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static _renameUsing write(ViewGroup p0, FragmentManager p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            getAnySetterField getanysetterfieldOnPause = p1.onPause();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getanysetterfieldOnPause, "");
            return read(p0, getanysetterfieldOnPause);
        }

        @getMagicModuleMeta
        public static _renameUsing read(ViewGroup p0, getAnySetterField p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Object tag = p0.getTag(findSubtypesCheckRepeatedNames.AudioAttributesCompatParcelizer.special_effects_controller_view_tag);
            if (tag instanceof _renameUsing) {
                return (_renameUsing) tag;
            }
            _renameUsing _renameusingRemoteActionCompatParcelizer = p1.RemoteActionCompatParcelizer(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_renameusingRemoteActionCompatParcelizer, "");
            p0.setTag(findSubtypesCheckRepeatedNames.AudioAttributesCompatParcelizer.special_effects_controller_view_tag, _renameusingRemoteActionCompatParcelizer);
            return _renameusingRemoteActionCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final _renameUsing read(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return Companion.write(viewGroup, fragmentManager);
    }

    @getMagicModuleMeta
    public static final _renameUsing IconCompatParcelizer(ViewGroup viewGroup, getAnySetterField getanysetterfield) {
        return Companion.read(viewGroup, getanysetterfield);
    }
}
