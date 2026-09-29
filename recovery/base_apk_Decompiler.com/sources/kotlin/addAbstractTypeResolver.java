package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u001b\u0010\u0003R\u001a\u0010\r\u001a\u00020\u00118\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lo/addAbstractTypeResolver;", "Lo/_handleOddName$IconCompatParcelizer;", "<init>", "()V", "Lo/_bindAndClose;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/_bindAndClose;)V", "read", "(Lo/_handleOddName$IconCompatParcelizer;)V", "Lo/Module;", "T", "AudioAttributesCompatParcelizer", "(Lo/Module;)Lo/Module;", "IconCompatParcelizer", "(Lo/Module;)V", "", "p1", "(ILo/_handleOddName$IconCompatParcelizer;)V", "", "write", "(IZ)V", "onPlayFromUri", "onRemoveQueueItemAt", "onPrepareFromUri", "onPrepare", "onPrepareFromSearch", "I", "onSeekTo", "()I", "Lo/_handleOddName$IconCompatParcelizer;", "onRemoveQueueItem", "()Lo/_handleOddName$IconCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class addAbstractTypeResolver extends _handleOddName.IconCompatParcelizer {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer = _findTreeDeserializer.read(this);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private _handleOddName.IconCompatParcelizer IconCompatParcelizer;

    /* JADX INFO: renamed from: onSeekTo, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void RemoteActionCompatParcelizer(_bindAndClose p0) {
        super.RemoteActionCompatParcelizer(p0);
        for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
            iconCompatParcelizer.RemoteActionCompatParcelizer(p0);
        }
    }

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from getter */
    public final _handleOddName.IconCompatParcelizer getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void read(_handleOddName.IconCompatParcelizer p0) {
        super.read(p0);
        for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
            iconCompatParcelizer.read(p0);
        }
    }

    protected final <T extends Module> T AudioAttributesCompatParcelizer(T p0) {
        _handleOddName.IconCompatParcelizer read = p0.getRead();
        if (read != p0) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizer = p0 instanceof _handleOddName.IconCompatParcelizer ? (_handleOddName.IconCompatParcelizer) p0 : null;
            _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = iconCompatParcelizer != null ? iconCompatParcelizer.getMediaBrowserCompatItemReceiver() : null;
            if (read == getRead() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(mediaBrowserCompatItemReceiver, this)) {
                return p0;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
        }
        if (read.getRatingCompat()) {
            reportWrongTokenException.read("Cannot delegate to an already attached node");
        }
        read.read(getRead());
        int write = getWrite();
        int iIconCompatParcelizer = _findTreeDeserializer.IconCompatParcelizer(read);
        read.read(iIconCompatParcelizer);
        IconCompatParcelizer(iIconCompatParcelizer, read);
        read.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        this.IconCompatParcelizer = read;
        read.RemoteActionCompatParcelizer(this);
        write(getWrite() | iIconCompatParcelizer, false);
        if (getRatingCompat()) {
            if ((iIconCompatParcelizer & _bind.write(2)) != 0 && (write & _bind.write(2)) == 0) {
                ObjectReader objectReader = collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).get_init_lambda2();
                getRead().RemoteActionCompatParcelizer((_bindAndClose) null);
                objectReader.MediaDescriptionCompat();
            } else {
                RemoteActionCompatParcelizer(getAudioAttributesImplApi21Parcelizer());
            }
            read.onPlayFromUri();
            read.onRemoveQueueItemAt();
            _findTreeDeserializer.write(read);
        }
        return p0;
    }

    protected final void IconCompatParcelizer(Module p0) {
        _handleOddName.IconCompatParcelizer iconCompatParcelizer = null;
        for (_handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer = this.IconCompatParcelizer; audioAttributesImplBaseParcelizer != null; audioAttributesImplBaseParcelizer = audioAttributesImplBaseParcelizer.getAudioAttributesImplBaseParcelizer()) {
            if (audioAttributesImplBaseParcelizer == p0) {
                if (audioAttributesImplBaseParcelizer.getRatingCompat()) {
                    _findTreeDeserializer.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer);
                    audioAttributesImplBaseParcelizer.onPrepareFromUri();
                    audioAttributesImplBaseParcelizer.onPrepare();
                }
                audioAttributesImplBaseParcelizer.read(audioAttributesImplBaseParcelizer);
                audioAttributesImplBaseParcelizer.write(0);
                if (iconCompatParcelizer == null) {
                    this.IconCompatParcelizer = audioAttributesImplBaseParcelizer.getAudioAttributesImplBaseParcelizer();
                } else {
                    iconCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizer.getAudioAttributesImplBaseParcelizer());
                }
                audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer((_handleOddName.IconCompatParcelizer) null);
                audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer((_handleOddName.IconCompatParcelizer) null);
                int write = getWrite();
                int iIconCompatParcelizer = _findTreeDeserializer.IconCompatParcelizer(this);
                write(iIconCompatParcelizer, true);
                if (getRatingCompat() && (write & _bind.write(2)) != 0 && (_bind.write(2) & iIconCompatParcelizer) == 0) {
                    ObjectReader objectReader = collectLongDefaults.AudioAttributesImplApi26Parcelizer(this).get_init_lambda2();
                    getRead().RemoteActionCompatParcelizer((_bindAndClose) null);
                    objectReader.MediaDescriptionCompat();
                    return;
                }
                return;
            }
            iconCompatParcelizer = audioAttributesImplBaseParcelizer;
        }
        throw new IllegalStateException("Could not find delegate: ".concat(String.valueOf(p0)).toString());
    }

    private final void IconCompatParcelizer(int p0, _handleOddName.IconCompatParcelizer p1) {
        int write = getWrite();
        if ((p0 & _bind.write(2)) == 0 || (_bind.write(2) & write) == 0 || (this instanceof _initForReading)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ");
        sb.append(this);
        sb.append("\nDelegate Node: ");
        sb.append(p1);
        reportWrongTokenException.read(sb.toString());
    }

    private final void write(int p0, boolean p1) {
        _handleOddName.IconCompatParcelizer audioAttributesImplBaseParcelizer;
        int write = getWrite();
        read(p0);
        if (write != p0) {
            if (collectLongDefaults.AudioAttributesCompatParcelizer(this)) {
                write(p0);
            }
            if (getRatingCompat()) {
                _handleOddName.IconCompatParcelizer read = getRead();
                addAbstractTypeResolver mediaBrowserCompatItemReceiver = this;
                while (mediaBrowserCompatItemReceiver != null) {
                    p0 |= mediaBrowserCompatItemReceiver.getWrite();
                    mediaBrowserCompatItemReceiver.read(p0);
                    if (mediaBrowserCompatItemReceiver == read) {
                        break;
                    } else {
                        mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver();
                    }
                }
                if (p1 && mediaBrowserCompatItemReceiver == read) {
                    p0 = _findTreeDeserializer.IconCompatParcelizer(read);
                    read.read(p0);
                }
                int remoteActionCompatParcelizer = p0 | ((mediaBrowserCompatItemReceiver == null || (audioAttributesImplBaseParcelizer = mediaBrowserCompatItemReceiver.getAudioAttributesImplBaseParcelizer()) == null) ? 0 : audioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer());
                while (mediaBrowserCompatItemReceiver != null) {
                    remoteActionCompatParcelizer |= mediaBrowserCompatItemReceiver.getWrite();
                    mediaBrowserCompatItemReceiver.write(remoteActionCompatParcelizer);
                    mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver();
                }
            }
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void onPlayFromUri() {
        super.onPlayFromUri();
        for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
            iconCompatParcelizer.RemoteActionCompatParcelizer(getAudioAttributesImplApi21Parcelizer());
            if (!iconCompatParcelizer.getRatingCompat()) {
                iconCompatParcelizer.onPlayFromUri();
            }
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void onPrepareFromUri() {
        super.onPrepareFromUri();
        for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
            iconCompatParcelizer.onPrepareFromUri();
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void onPrepareFromSearch() {
        super.onPrepareFromSearch();
        for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
            iconCompatParcelizer.onPrepareFromSearch();
        }
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void onRemoveQueueItemAt() {
        for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
            iconCompatParcelizer.onRemoveQueueItemAt();
        }
        super.onRemoveQueueItemAt();
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public void onPrepare() {
        for (_handleOddName.IconCompatParcelizer iconCompatParcelizer = getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
            iconCompatParcelizer.onPrepare();
        }
        super.onPrepare();
    }
}
