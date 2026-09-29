package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.setTag;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0012\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u001eJ'\u0010 \u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020%H\u0002¢\u0006\u0004\b\u0010\u0010&J'\u0010#\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020'H\u0002¢\u0006\u0004\b#\u0010(J1\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010)2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010*J)\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010)2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010+J!\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b\u001a\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010/R\u0014\u0010\u0010\u001a\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u00100R\u0018\u0010#\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u00101R\u0014\u0010\u0012\u001a\u00020'8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00102R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u00103R\u0014\u0010-\u001a\u00020\"8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u00104R\u0018\u0010\u001d\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u00105R\u0014\u0010\n\u001a\u00020%8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u00106R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0018\u0010:\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020C8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0016\u0010F\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010="}, d2 = {"Lo/setFitsSystemWindows;", "", "Lo/Guideline;", "p0", "<init>", "(Lo/Guideline;)V", "Lo/getAccessibilityNodeProvider;", "AudioAttributesImplApi26Parcelizer", "()Lo/getAccessibilityNodeProvider;", "Lo/reportPropertyInputMismatch;", "MediaBrowserCompatItemReceiver", "()Lo/reportPropertyInputMismatch;", "Lo/DatabindContext;", "Lo/_shapeForToken;", "p1", "", "AudioAttributesCompatParcelizer", "(Lo/DatabindContext;Lo/_shapeForToken;)V", "RemoteActionCompatParcelizer", "()V", "Lo/_colonConcat;", "Lo/findClass;", "Lo/getReferencedType;", "p2", "", "p3", "read", "(Lo/_colonConcat;JJZ)V", "(J)V", "MediaBrowserCompatCustomActionResultReceiver", "(Lo/_colonConcat;JLo/getAccessibilityNodeProvider;)V", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read;", "IconCompatParcelizer", "(Lo/DatabindContext;Lo/_shapeForToken;Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read;)V", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$write;", "write", "(Lo/DatabindContext;Lo/_shapeForToken;Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$write;)V", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer;", "(Lo/DatabindContext;Lo/_shapeForToken;Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer;)V", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "(Lo/DatabindContext;Lo/_shapeForToken;Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$IconCompatParcelizer;)V", "Lo/getWrapperName;", "(Lo/_colonConcat;Lo/_colonConcat;Lo/getWrapperName;J)V", "(Lo/_colonConcat;Lo/getWrapperName;J)V", "(Lo/_colonConcat;Lo/getWrapperName;)V", "AudioAttributesImplBaseParcelizer", "Lo/Guideline;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read;", "()Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "()Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$write;", "()Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$write;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer;", "()Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer;", "AudioAttributesImplApi21Parcelizer", "MediaDescriptionCompat", "Lo/reportPropertyInputMismatch;", "MediaBrowserCompatMediaItem", "J", "MediaBrowserCompatSearchResultReceiver", "Lo/getAccessibilityNodeProvider;", "Lo/CoordinatorLayoutSavedState;", "MediaMetadataCompat", "Lo/CoordinatorLayoutSavedState;", "Lo/getExtraData;", "Lo/getExtraData;", "RatingCompat", "onCustomAction"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setFitsSystemWindows {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private AudioAttributesCompatParcelizer.write AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private getAccessibilityNodeProvider MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Guideline read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private AudioAttributesCompatParcelizer.C0139AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private reportPropertyInputMismatch MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private AudioAttributesCompatParcelizer.IconCompatParcelizer write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private AudioAttributesCompatParcelizer.read IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private long MediaBrowserCompatSearchResultReceiver = getReferencedType.INSTANCE.read();
    private final CoordinatorLayoutSavedState MediaMetadataCompat = new CoordinatorLayoutSavedState();

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getExtraData RatingCompat = new getExtraData();

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private long onCustomAction = getReferencedType.INSTANCE.write();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[AudioAttributesCompatParcelizer.read.EnumC0140read.values().length];
            try {
                iArr[AudioAttributesCompatParcelizer.read.EnumC0140read.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public setFitsSystemWindows(Guideline guideline) {
        this.read = guideline;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AudioAttributesCompatParcelizer.read IconCompatParcelizer() {
        AudioAttributesCompatParcelizer.read readVar = this.IconCompatParcelizer;
        if (readVar != null) {
            return readVar;
        }
        AudioAttributesCompatParcelizer.read readVar2 = new AudioAttributesCompatParcelizer.read(null, false, 3, 0 == true ? 1 : 0);
        this.IconCompatParcelizer = readVar2;
        return readVar2;
    }

    private final AudioAttributesCompatParcelizer.IconCompatParcelizer read() {
        AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizer = this.write;
        if (iconCompatParcelizer != null) {
            return iconCompatParcelizer;
        }
        AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizer2 = new AudioAttributesCompatParcelizer.IconCompatParcelizer(0L, 1, null);
        this.write = iconCompatParcelizer2;
        return iconCompatParcelizer2;
    }

    private final AudioAttributesCompatParcelizer.write write() {
        AudioAttributesCompatParcelizer.write writeVar = this.AudioAttributesImplApi26Parcelizer;
        if (writeVar != null) {
            return writeVar;
        }
        AudioAttributesCompatParcelizer.write writeVar2 = new AudioAttributesCompatParcelizer.write(null, 0L, false, 7, null);
        this.AudioAttributesImplApi26Parcelizer = writeVar2;
        return writeVar2;
    }

    private final AudioAttributesCompatParcelizer.C0139AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
        AudioAttributesCompatParcelizer.C0139AudioAttributesCompatParcelizer c0139AudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
        if (c0139AudioAttributesCompatParcelizer != null) {
            return c0139AudioAttributesCompatParcelizer;
        }
        AudioAttributesCompatParcelizer.C0139AudioAttributesCompatParcelizer c0139AudioAttributesCompatParcelizer2 = new AudioAttributesCompatParcelizer.C0139AudioAttributesCompatParcelizer(null, 0L, null, 7, null);
        this.MediaBrowserCompatCustomActionResultReceiver = c0139AudioAttributesCompatParcelizer2;
        return c0139AudioAttributesCompatParcelizer2;
    }

    private final getAccessibilityNodeProvider AudioAttributesImplApi26Parcelizer() {
        getAccessibilityNodeProvider getaccessibilitynodeprovider = this.MediaDescriptionCompat;
        if (getaccessibilitynodeprovider != null) {
            return getaccessibilitynodeprovider;
        }
        throw new IllegalArgumentException("Touch slop detector not initialized.".toString());
    }

    private final reportPropertyInputMismatch MediaBrowserCompatItemReceiver() {
        reportPropertyInputMismatch reportpropertyinputmismatch = this.MediaBrowserCompatMediaItem;
        if (reportpropertyinputmismatch != null) {
            return reportpropertyinputmismatch;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.".toString());
    }

    public final void AudioAttributesCompatParcelizer(DatabindContext p0, _shapeForToken p1) {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            this.AudioAttributesImplApi21Parcelizer = IconCompatParcelizer();
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        if (audioAttributesCompatParcelizer == null) {
            throw new IllegalArgumentException("currentDragState should not be null".toString());
        }
        if (audioAttributesCompatParcelizer instanceof AudioAttributesCompatParcelizer.read) {
            IconCompatParcelizer(p0, p1, (AudioAttributesCompatParcelizer.read) audioAttributesCompatParcelizer);
            return;
        }
        if (audioAttributesCompatParcelizer instanceof AudioAttributesCompatParcelizer.write) {
            write(p0, p1, (AudioAttributesCompatParcelizer.write) audioAttributesCompatParcelizer);
        } else if (audioAttributesCompatParcelizer instanceof AudioAttributesCompatParcelizer.C0139AudioAttributesCompatParcelizer) {
            AudioAttributesCompatParcelizer(p0, p1, (AudioAttributesCompatParcelizer.C0139AudioAttributesCompatParcelizer) audioAttributesCompatParcelizer);
        } else {
            if (!(audioAttributesCompatParcelizer instanceof AudioAttributesCompatParcelizer.IconCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            write(p0, p1, (AudioAttributesCompatParcelizer.IconCompatParcelizer) audioAttributesCompatParcelizer);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        MediaBrowserCompatCustomActionResultReceiver();
        if (this.read.getMediaBrowserCompatItemReceiver()) {
            AudioAttributesImplBaseParcelizer();
        }
        this.MediaBrowserCompatMediaItem = null;
        this.RatingCompat.AudioAttributesCompatParcelizer();
    }

    static /* synthetic */ void read$default(setFitsSystemWindows setfitssystemwindows, _colonConcat _colonconcat, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = getReferencedType.INSTANCE.write();
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            z = false;
        }
        setfitssystemwindows.read(_colonconcat, j, j3, z);
    }

    private final void read(_colonConcat p0, long p1, long p2, boolean p3) {
        AudioAttributesCompatParcelizer.write writeVarWrite = write();
        writeVarWrite.RemoteActionCompatParcelizer(p0);
        writeVarWrite.write(p1);
        getAccessibilityNodeProvider getaccessibilitynodeprovider = this.MediaDescriptionCompat;
        if (getaccessibilitynodeprovider == null) {
            this.MediaDescriptionCompat = new getAccessibilityNodeProvider(this.read.getAudioAttributesCompatParcelizer(), 0L, 2, null);
        } else {
            if (getaccessibilitynodeprovider != null) {
                getaccessibilitynodeprovider.read(this.read.getAudioAttributesCompatParcelizer());
            }
            getAccessibilityNodeProvider getaccessibilitynodeprovider2 = this.MediaDescriptionCompat;
            if (getaccessibilitynodeprovider2 != null) {
                getaccessibilitynodeprovider2.IconCompatParcelizer(p2);
            }
        }
        writeVarWrite.RemoteActionCompatParcelizer(p3);
        this.AudioAttributesImplApi21Parcelizer = writeVarWrite;
    }

    private final void RemoteActionCompatParcelizer(long p0) {
        AudioAttributesCompatParcelizer.IconCompatParcelizer iconCompatParcelizer = read();
        iconCompatParcelizer.IconCompatParcelizer(p0);
        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        AudioAttributesCompatParcelizer.read readVarIconCompatParcelizer = IconCompatParcelizer();
        readVarIconCompatParcelizer.write(AudioAttributesCompatParcelizer.read.EnumC0140read.AudioAttributesCompatParcelizer);
        readVarIconCompatParcelizer.read(false);
        this.AudioAttributesImplApi21Parcelizer = readVarIconCompatParcelizer;
    }

    private final void AudioAttributesCompatParcelizer(_colonConcat p0, long p1, getAccessibilityNodeProvider p2) {
        AudioAttributesCompatParcelizer.C0139AudioAttributesCompatParcelizer c0139AudioAttributesCompatParcelizerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        c0139AudioAttributesCompatParcelizerAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        c0139AudioAttributesCompatParcelizerAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p1);
        getAccessibilityNodeProvider.IconCompatParcelizer$default(p2, 0L, 1, null);
        c0139AudioAttributesCompatParcelizerAudioAttributesCompatParcelizer.write(p2);
        this.AudioAttributesImplApi21Parcelizer = c0139AudioAttributesCompatParcelizerAudioAttributesCompatParcelizer;
    }

    private final void IconCompatParcelizer(DatabindContext p0, _shapeForToken p1, AudioAttributesCompatParcelizer.read p2) {
        AudioAttributesCompatParcelizer.read.EnumC0140read write;
        if (p0.IconCompatParcelizer().isEmpty()) {
            return;
        }
        List<_colonConcat> listIconCompatParcelizer = p0.IconCompatParcelizer();
        int size = listIconCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            if (!VirtualLayout.write(listIconCompatParcelizer.get(i))) {
                return;
            }
        }
        _colonConcat _colonconcat = (_colonConcat) IntermediateLoginResponseBody.RatingCompat((List) p0.IconCompatParcelizer());
        if (WhenMappings.RemoteActionCompatParcelizer[p2.getWrite().ordinal()] == 1) {
            if (!this.read.getWrite()) {
                write = AudioAttributesCompatParcelizer.read.EnumC0140read.read;
            } else {
                write = AudioAttributesCompatParcelizer.read.EnumC0140read.write;
            }
        } else {
            write = p2.getWrite();
        }
        p2.write(write);
        if (p1 == _shapeForToken.IconCompatParcelizer && write == AudioAttributesCompatParcelizer.read.EnumC0140read.write) {
            _colonconcat.IconCompatParcelizer();
            p2.read(true);
        }
        if (p1 == _shapeForToken.AudioAttributesCompatParcelizer) {
            if (write == AudioAttributesCompatParcelizer.read.EnumC0140read.read) {
                read$default(this, _colonconcat, _colonconcat.getAudioAttributesCompatParcelizer(), 0L, false, 12, null);
            } else if (p2.getAudioAttributesCompatParcelizer()) {
                read(_colonconcat, _colonconcat, getWrapperName.IconCompatParcelizer(p0.getRead()), getReferencedType.INSTANCE.write());
                read(_colonconcat, getWrapperName.IconCompatParcelizer(p0.getRead()), getReferencedType.INSTANCE.write());
                RemoteActionCompatParcelizer(_colonconcat.getAudioAttributesCompatParcelizer());
            }
        }
    }

    private final void write(DatabindContext p0, _shapeForToken p1, AudioAttributesCompatParcelizer.write p2) {
        _colonConcat _colonconcat;
        _colonConcat _colonconcat2;
        _colonConcat _colonconcat3;
        if (p1 != _shapeForToken.IconCompatParcelizer) {
            List<_colonConcat> listIconCompatParcelizer = p0.IconCompatParcelizer();
            int size = listIconCompatParcelizer.size();
            int i = 0;
            while (true) {
                _colonconcat = null;
                if (i >= size) {
                    _colonconcat2 = null;
                    break;
                }
                _colonconcat2 = listIconCompatParcelizer.get(i);
                if (findClass.AudioAttributesCompatParcelizer(_colonconcat2.getAudioAttributesCompatParcelizer(), p2.getAudioAttributesCompatParcelizer())) {
                    break;
                } else {
                    i++;
                }
            }
            _colonConcat _colonconcat4 = _colonconcat2;
            if (_colonconcat4 == null) {
                List<_colonConcat> listIconCompatParcelizer2 = p0.IconCompatParcelizer();
                int size2 = listIconCompatParcelizer2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        _colonconcat3 = null;
                        break;
                    }
                    _colonconcat3 = listIconCompatParcelizer2.get(i2);
                    if (_colonconcat3.getRemoteActionCompatParcelizer()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                _colonconcat4 = _colonconcat3;
                if (_colonconcat4 == null) {
                    MediaBrowserCompatCustomActionResultReceiver();
                    return;
                }
                p2.write(_colonconcat4.getAudioAttributesCompatParcelizer());
            }
            _colonConcat _colonconcat5 = _colonconcat4;
            if (p1 == _shapeForToken.AudioAttributesCompatParcelizer) {
                if (!_colonconcat5.getMediaBrowserCompatCustomActionResultReceiver()) {
                    if (VirtualLayout.RemoteActionCompatParcelizer(_colonconcat5)) {
                        List<_colonConcat> listIconCompatParcelizer3 = p0.IconCompatParcelizer();
                        int size3 = listIconCompatParcelizer3.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                break;
                            }
                            _colonConcat _colonconcat6 = listIconCompatParcelizer3.get(i3);
                            if (_colonconcat6.getRemoteActionCompatParcelizer()) {
                                _colonconcat = _colonconcat6;
                                break;
                            }
                            i3++;
                        }
                        _colonConcat _colonconcat7 = _colonconcat;
                        if (_colonconcat7 == null) {
                            MediaBrowserCompatCustomActionResultReceiver();
                        } else {
                            p2.write(_colonconcat7.getAudioAttributesCompatParcelizer());
                        }
                    } else {
                        long jRemoteActionCompatParcelizer = AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(VirtualLayout.MediaBrowserCompatItemReceiver(_colonconcat5, this.read.getAudioAttributesCompatParcelizer(), getWrapperName.IconCompatParcelizer(p0.getRead())), VirtualLayout.AudioAttributesImplApi26Parcelizer(_colonconcat5, this.read.getAudioAttributesCompatParcelizer(), getWrapperName.IconCompatParcelizer(p0.getRead())), setConstraintSet.write((CoercionConfig) MappingJsonFactory.write(this.read, getDefaultNullValueSerializer.onAddQueueItem()), handleWeirdNumberValue.INSTANCE.AudioAttributesCompatParcelizer()));
                        if ((9223372034707292159L & jRemoteActionCompatParcelizer) != 9205357640488583168L) {
                            _colonconcat5.IconCompatParcelizer();
                            _colonConcat remoteActionCompatParcelizer = p2.getRemoteActionCompatParcelizer();
                            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer);
                            read(remoteActionCompatParcelizer, _colonconcat5, getWrapperName.IconCompatParcelizer(p0.getRead()), jRemoteActionCompatParcelizer);
                            read(_colonconcat5, getWrapperName.IconCompatParcelizer(p0.getRead()), jRemoteActionCompatParcelizer);
                            RemoteActionCompatParcelizer(_colonconcat5.getAudioAttributesCompatParcelizer());
                        } else {
                            p2.RemoteActionCompatParcelizer(true);
                        }
                    }
                } else {
                    _colonConcat remoteActionCompatParcelizer2 = p2.getRemoteActionCompatParcelizer();
                    if (remoteActionCompatParcelizer2 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized".toString());
                    }
                    long audioAttributesCompatParcelizer = p2.getAudioAttributesCompatParcelizer();
                    getAccessibilityNodeProvider getaccessibilitynodeprovider = this.MediaDescriptionCompat;
                    if (getaccessibilitynodeprovider != null) {
                        AudioAttributesCompatParcelizer(remoteActionCompatParcelizer2, audioAttributesCompatParcelizer, getaccessibilitynodeprovider);
                    } else {
                        throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized".toString());
                    }
                }
            }
            if (p1 == _shapeForToken.read && p2.getWrite()) {
                if (_colonconcat5.getMediaBrowserCompatCustomActionResultReceiver()) {
                    _colonConcat remoteActionCompatParcelizer3 = p2.getRemoteActionCompatParcelizer();
                    if (remoteActionCompatParcelizer3 == null) {
                        throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized".toString());
                    }
                    long audioAttributesCompatParcelizer2 = p2.getAudioAttributesCompatParcelizer();
                    getAccessibilityNodeProvider getaccessibilitynodeprovider2 = this.MediaDescriptionCompat;
                    if (getaccessibilitynodeprovider2 != null) {
                        AudioAttributesCompatParcelizer(remoteActionCompatParcelizer3, audioAttributesCompatParcelizer2, getaccessibilitynodeprovider2);
                        return;
                    }
                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized".toString());
                }
                p2.RemoteActionCompatParcelizer(false);
            }
        }
    }

    private final void AudioAttributesCompatParcelizer(DatabindContext p0, _shapeForToken p1, AudioAttributesCompatParcelizer.C0139AudioAttributesCompatParcelizer p2) {
        boolean z;
        if (p1 == _shapeForToken.read) {
            List<_colonConcat> listIconCompatParcelizer = p0.IconCompatParcelizer();
            int size = listIconCompatParcelizer.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = true;
                    break;
                } else {
                    if (listIconCompatParcelizer.get(i2).getMediaBrowserCompatCustomActionResultReceiver()) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            List<_colonConcat> listIconCompatParcelizer2 = p0.IconCompatParcelizer();
            int size2 = listIconCompatParcelizer2.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                if (!listIconCompatParcelizer2.get(i).getRemoteActionCompatParcelizer()) {
                    i++;
                } else if (!p0.IconCompatParcelizer().isEmpty()) {
                    if (z) {
                        long jMediaBrowserCompatItemReceiver = VirtualLayout.MediaBrowserCompatItemReceiver((_colonConcat) IntermediateLoginResponseBody.RatingCompat((List) p0.IconCompatParcelizer()), this.read.getAudioAttributesCompatParcelizer(), getWrapperName.IconCompatParcelizer(p0.getRead()));
                        _colonConcat iconCompatParcelizer = p2.getIconCompatParcelizer();
                        toMagicModuleMetaRepoModel.write(iconCompatParcelizer);
                        long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer(jMediaBrowserCompatItemReceiver, VirtualLayout.MediaBrowserCompatItemReceiver(iconCompatParcelizer, this.read.getAudioAttributesCompatParcelizer(), getWrapperName.IconCompatParcelizer(p0.getRead())));
                        _colonConcat iconCompatParcelizer2 = p2.getIconCompatParcelizer();
                        if (iconCompatParcelizer2 != null) {
                            read$default(this, iconCompatParcelizer2, p2.getWrite(), jAudioAttributesCompatParcelizer, false, 8, null);
                            return;
                        }
                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.".toString());
                    }
                    return;
                }
            }
            MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    private final void write(DatabindContext p0, _shapeForToken p1, AudioAttributesCompatParcelizer.IconCompatParcelizer p2) {
        _colonConcat _colonconcat;
        _colonConcat _colonconcat2;
        if (p1 == _shapeForToken.AudioAttributesCompatParcelizer) {
            long iconCompatParcelizer = p2.getIconCompatParcelizer();
            List<_colonConcat> listIconCompatParcelizer = p0.IconCompatParcelizer();
            int size = listIconCompatParcelizer.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                _colonconcat = null;
                if (i2 >= size) {
                    _colonconcat2 = null;
                    break;
                }
                _colonconcat2 = listIconCompatParcelizer.get(i2);
                if (findClass.AudioAttributesCompatParcelizer(_colonconcat2.getAudioAttributesCompatParcelizer(), iconCompatParcelizer)) {
                    break;
                } else {
                    i2++;
                }
            }
            _colonConcat _colonconcat3 = _colonconcat2;
            if (_colonconcat3 == null) {
                return;
            }
            if (VirtualLayout.RemoteActionCompatParcelizer(_colonconcat3)) {
                List<_colonConcat> listIconCompatParcelizer2 = p0.IconCompatParcelizer();
                int size2 = listIconCompatParcelizer2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    _colonConcat _colonconcat4 = listIconCompatParcelizer2.get(i);
                    if (_colonconcat4.getRemoteActionCompatParcelizer()) {
                        _colonconcat = _colonconcat4;
                        break;
                    }
                    i++;
                }
                _colonConcat _colonconcat5 = _colonconcat;
                if (_colonconcat5 == null) {
                    if (!_colonconcat3.getMediaBrowserCompatCustomActionResultReceiver() && VirtualLayout.RemoteActionCompatParcelizer(_colonconcat3)) {
                        read(_colonconcat3, getWrapperName.IconCompatParcelizer(p0.getRead()));
                    } else {
                        AudioAttributesImplBaseParcelizer();
                    }
                    MediaBrowserCompatCustomActionResultReceiver();
                    return;
                }
                p2.IconCompatParcelizer(_colonconcat5.getAudioAttributesCompatParcelizer());
                return;
            }
            if (_colonconcat3.getMediaBrowserCompatCustomActionResultReceiver()) {
                AudioAttributesImplBaseParcelizer();
            } else {
                if (getReferencedType.IconCompatParcelizer(VirtualLayout.AudioAttributesImplBaseParcelizer(_colonconcat3, this.read.getAudioAttributesCompatParcelizer(), getWrapperName.IconCompatParcelizer(p0.getRead()))) == BitmapDescriptorFactory.HUE_RED) {
                    return;
                }
                read(_colonconcat3, getWrapperName.IconCompatParcelizer(p0.getRead()), VirtualLayout.AudioAttributesCompatParcelizer(_colonconcat3, this.read.getAudioAttributesCompatParcelizer(), getWrapperName.IconCompatParcelizer(p0.getRead())));
                _colonconcat3.IconCompatParcelizer();
            }
        }
    }

    private final void read(_colonConcat p0, _colonConcat p1, getWrapperName p2, long p3) {
        if (this.MediaBrowserCompatMediaItem == null) {
            this.MediaBrowserCompatMediaItem = new reportPropertyInputMismatch();
        }
        this.onCustomAction = getReferencedType.INSTANCE.write();
        VirtualLayout.IconCompatParcelizer(MediaBrowserCompatItemReceiver(), p0, this.read.getAudioAttributesCompatParcelizer(), p2, this.MediaMetadataCompat, this.onCustomAction);
        long jAudioAttributesCompatParcelizer = getReferencedType.AudioAttributesCompatParcelizer(VirtualLayout.MediaBrowserCompatItemReceiver(p1, this.read.getAudioAttributesCompatParcelizer(), p2), p3);
        if (this.read.write().invoke(handleWeirdNumberValue.AudioAttributesCompatParcelizer(handleWeirdNumberValue.INSTANCE.AudioAttributesCompatParcelizer())).booleanValue()) {
            this.MediaBrowserCompatSearchResultReceiver = hasRawClass.MediaBrowserCompatCustomActionResultReceiver(collectLongDefaults.AudioAttributesImplApi21Parcelizer(this.read));
            this.read.read(new setTag.IconCompatParcelizer(jAudioAttributesCompatParcelizer, null));
        }
        this.RatingCompat.AudioAttributesCompatParcelizer();
    }

    private final void read(_colonConcat p0, getWrapperName p1, long p2) {
        long jMediaBrowserCompatCustomActionResultReceiver = hasRawClass.MediaBrowserCompatCustomActionResultReceiver(collectLongDefaults.AudioAttributesImplApi21Parcelizer(this.read));
        if (!getReferencedType.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, getReferencedType.INSTANCE.read()) && !getReferencedType.IconCompatParcelizer(jMediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatSearchResultReceiver)) {
            this.onCustomAction = getReferencedType.RemoteActionCompatParcelizer(this.onCustomAction, getReferencedType.AudioAttributesCompatParcelizer(jMediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatSearchResultReceiver));
        }
        this.MediaBrowserCompatSearchResultReceiver = jMediaBrowserCompatCustomActionResultReceiver;
        superDispatchKeyEvent audioAttributesCompatParcelizer = this.read.getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer);
        if (Math.abs(setContentId.RemoteActionCompatParcelizer(p2, audioAttributesCompatParcelizer)) > 2.0f) {
            VirtualLayout.IconCompatParcelizer(MediaBrowserCompatItemReceiver(), p0, this.read.getAudioAttributesCompatParcelizer(), p1, this.MediaMetadataCompat, this.onCustomAction);
            this.read.read(new setTag.AudioAttributesCompatParcelizer(this.RatingCompat.IconCompatParcelizer(p2), true, null));
        }
    }

    private final void read(_colonConcat p0, getWrapperName p1) {
        VirtualLayout.IconCompatParcelizer(MediaBrowserCompatItemReceiver(), p0, this.read.getAudioAttributesCompatParcelizer(), p1, this.MediaMetadataCompat, this.onCustomAction);
        float fAudioAttributesImplApi21Parcelizer = ((CoercionConfig) MappingJsonFactory.write(this.read, getDefaultNullValueSerializer.onAddQueueItem())).AudioAttributesImplApi21Parcelizer();
        long j = MediaBrowserCompatItemReceiver().read(ValueInjector.read(fAudioAttributesImplApi21Parcelizer, fAudioAttributesImplApi21Parcelizer));
        MediaBrowserCompatItemReceiver().IconCompatParcelizer();
        this.read.read(new setTag.write(setContentId.RemoteActionCompatParcelizer(j), true, null));
    }

    private final void AudioAttributesImplBaseParcelizer() {
        this.read.read(setTag.read.INSTANCE);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "read", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$write;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\b\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u000f\u0010\u0011"}, d2 = {"Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read$read;", "p0", "", "p1", "<init>", "(Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read$read;Z)V", "AudioAttributesCompatParcelizer", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read$read;", "()Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read$read;", "write", "(Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read$read;)V", "RemoteActionCompatParcelizer", "Z", "read", "()Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class read extends AudioAttributesCompatParcelizer {

            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
            private EnumC0140read write;

            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
            private boolean AudioAttributesCompatParcelizer;

            public read(EnumC0140read enumC0140read, boolean z) {
                super(null);
                this.write = enumC0140read;
                this.AudioAttributesCompatParcelizer = z;
            }

            public /* synthetic */ read(EnumC0140read enumC0140read, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this((i & 1) != 0 ? EnumC0140read.AudioAttributesCompatParcelizer : enumC0140read, (i & 2) != 0 ? false : z);
            }

            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
            public final EnumC0140read getWrite() {
                return this.write;
            }

            public final void write(EnumC0140read enumC0140read) {
                this.write = enumC0140read;
            }

            public final void read(boolean z) {
                this.AudioAttributesCompatParcelizer = z;
            }

            /* JADX INFO: renamed from: read, reason: from getter */
            public final boolean getAudioAttributesCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public read() {
                this(null, false, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: o.setFitsSystemWindows$AudioAttributesCompatParcelizer$read$read, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$read$read;", "", "<init>", "(Ljava/lang/String;I)V", "read", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class EnumC0140read {
                private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
                private static final /* synthetic */ EnumC0140read[] RemoteActionCompatParcelizer;
                public static final EnumC0140read read = new EnumC0140read("Yes", 0);
                public static final EnumC0140read write = new EnumC0140read("No", 1);
                public static final EnumC0140read AudioAttributesCompatParcelizer = new EnumC0140read("NotInitialized", 2);

                private EnumC0140read(String str, int i) {
                }

                static {
                    EnumC0140read[] enumC0140readArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
                    RemoteActionCompatParcelizer = enumC0140readArrAudioAttributesCompatParcelizer;
                    IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(enumC0140readArrAudioAttributesCompatParcelizer);
                }

                private static final /* synthetic */ EnumC0140read[] AudioAttributesCompatParcelizer() {
                    return new EnumC0140read[]{read, write, AudioAttributesCompatParcelizer};
                }

                public static EnumC0140read valueOf(String str) {
                    return (EnumC0140read) Enum.valueOf(EnumC0140read.class, str);
                }

                public static EnumC0140read[] values() {
                    return (EnumC0140read[]) RemoteActionCompatParcelizer.clone();
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012\"\u0004\b\n\u0010\u0013R\"\u0010\n\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016\"\u0004\b\u000e\u0010\u0017"}, d2 = {"Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$write;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer;", "Lo/_colonConcat;", "p0", "Lo/findClass;", "p1", "", "p2", "<init>", "(Lo/_colonConcat;JZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "Lo/_colonConcat;", "IconCompatParcelizer", "()Lo/_colonConcat;", "RemoteActionCompatParcelizer", "(Lo/_colonConcat;)V", "AudioAttributesCompatParcelizer", "J", "()J", "(J)V", "read", "Z", "()Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class write extends AudioAttributesCompatParcelizer {
            private long AudioAttributesCompatParcelizer;

            /* JADX INFO: renamed from: read, reason: from kotlin metadata */
            private boolean write;

            /* JADX INFO: renamed from: write, reason: from kotlin metadata */
            private _colonConcat RemoteActionCompatParcelizer;

            private write(_colonConcat _colonconcat, long j, boolean z) {
                super(null);
                this.RemoteActionCompatParcelizer = _colonconcat;
                this.AudioAttributesCompatParcelizer = j;
                this.write = z;
            }

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
            public final _colonConcat getRemoteActionCompatParcelizer() {
                return this.RemoteActionCompatParcelizer;
            }

            public final void RemoteActionCompatParcelizer(_colonConcat _colonconcat) {
                this.RemoteActionCompatParcelizer = _colonconcat;
            }

            public /* synthetic */ write(_colonConcat _colonconcat, long j, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this((i & 1) != 0 ? null : _colonconcat, (i & 2) != 0 ? findClass.RemoteActionCompatParcelizer(Long.MAX_VALUE) : j, (i & 4) != 0 ? false : z, null);
            }

            /* JADX INFO: renamed from: write, reason: from getter */
            public final long getAudioAttributesCompatParcelizer() {
                return this.AudioAttributesCompatParcelizer;
            }

            public final void write(long j) {
                this.AudioAttributesCompatParcelizer = j;
            }

            public final void RemoteActionCompatParcelizer(boolean z) {
                this.write = z;
            }

            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
            public final boolean getWrite() {
                return this.write;
            }

            public /* synthetic */ write(_colonConcat _colonconcat, long j, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this(_colonconcat, j, z);
            }
        }

        /* JADX INFO: renamed from: o.setFitsSystemWindows$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\f\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011\"\u0004\b\f\u0010\u0012R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\"\u0004\b\u0013\u0010\u0015"}, d2 = {"Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer;", "Lo/_colonConcat;", "p0", "Lo/findClass;", "p1", "Lo/getAccessibilityNodeProvider;", "p2", "<init>", "(Lo/_colonConcat;JLo/getAccessibilityNodeProvider;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "IconCompatParcelizer", "Lo/_colonConcat;", "AudioAttributesCompatParcelizer", "()Lo/_colonConcat;", "(Lo/_colonConcat;)V", "read", "J", "()J", "(J)V", "write", "Lo/getAccessibilityNodeProvider;", "(Lo/getAccessibilityNodeProvider;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0139AudioAttributesCompatParcelizer extends AudioAttributesCompatParcelizer {
            private _colonConcat IconCompatParcelizer;

            /* JADX INFO: renamed from: read, reason: from kotlin metadata */
            private long write;

            /* JADX INFO: renamed from: write, reason: from kotlin metadata */
            private getAccessibilityNodeProvider AudioAttributesCompatParcelizer;

            private C0139AudioAttributesCompatParcelizer(_colonConcat _colonconcat, long j, getAccessibilityNodeProvider getaccessibilitynodeprovider) {
                super(null);
                this.IconCompatParcelizer = _colonconcat;
                this.write = j;
                this.AudioAttributesCompatParcelizer = getaccessibilitynodeprovider;
            }

            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
            public final _colonConcat getIconCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public final void AudioAttributesCompatParcelizer(_colonConcat _colonconcat) {
                this.IconCompatParcelizer = _colonconcat;
            }

            public /* synthetic */ C0139AudioAttributesCompatParcelizer(_colonConcat _colonconcat, long j, getAccessibilityNodeProvider getaccessibilitynodeprovider, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this((i & 1) != 0 ? null : _colonconcat, (i & 2) != 0 ? findClass.RemoteActionCompatParcelizer(Long.MAX_VALUE) : j, (i & 4) != 0 ? null : getaccessibilitynodeprovider, null);
            }

            public final void AudioAttributesCompatParcelizer(long j) {
                this.write = j;
            }

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
            public final long getWrite() {
                return this.write;
            }

            public final void write(getAccessibilityNodeProvider getaccessibilitynodeprovider) {
                this.AudioAttributesCompatParcelizer = getaccessibilitynodeprovider;
            }

            public /* synthetic */ C0139AudioAttributesCompatParcelizer(_colonConcat _colonconcat, long j, getAccessibilityNodeProvider getaccessibilitynodeprovider, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this(_colonconcat, j, getaccessibilitynodeprovider);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\t\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "Lo/setFitsSystemWindows$AudioAttributesCompatParcelizer;", "Lo/findClass;", "p0", "<init>", "(JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "J", "()J", "IconCompatParcelizer", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconCompatParcelizer extends AudioAttributesCompatParcelizer {

            /* JADX INFO: renamed from: write, reason: from kotlin metadata */
            private long IconCompatParcelizer;

            private IconCompatParcelizer(long j) {
                super(null);
                this.IconCompatParcelizer = j;
            }

            public /* synthetic */ IconCompatParcelizer(long j, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this((i & 1) != 0 ? findClass.RemoteActionCompatParcelizer(Long.MAX_VALUE) : j, null);
            }

            public final void IconCompatParcelizer(long j) {
                this.IconCompatParcelizer = j;
            }

            /* JADX INFO: renamed from: write, reason: from getter */
            public final long getIconCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public /* synthetic */ IconCompatParcelizer(long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this(j);
            }
        }
    }
}
