package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin._assertNotNull;
import kotlin.registerModule;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/getDeserializationConfig;", "", "Lo/_assertNotNull;", "p0", "Lo/getModuleName;", "p1", "", "Lo/registerModule$IconCompatParcelizer;", "p2", "<init>", "(Lo/_assertNotNull;Lo/getModuleName;Ljava/util/List;)V", "", "IconCompatParcelizer", "()V", "", "RemoteActionCompatParcelizer", "(Lo/_assertNotNull;)Z", "read", "", "AudioAttributesCompatParcelizer", "(Lo/_assertNotNull;)Ljava/lang/String;", "()Ljava/lang/String;", "Lo/_assertNotNull;", "Lo/getModuleName;", "write", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeserializationConfig {
    private final _assertNotNull AudioAttributesCompatParcelizer;
    private final getModuleName read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final List<registerModule.IconCompatParcelizer> IconCompatParcelizer;

    public getDeserializationConfig(_assertNotNull _assertnotnull, getModuleName getmodulename, List<registerModule.IconCompatParcelizer> list) {
        this.AudioAttributesCompatParcelizer = _assertnotnull;
        this.read = getmodulename;
        this.IconCompatParcelizer = list;
    }

    public final void IconCompatParcelizer() {
        if (RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer)) {
            return;
        }
        System.out.println((Object) AudioAttributesCompatParcelizer());
        throw new IllegalStateException("Inconsistency found!");
    }

    private final boolean RemoteActionCompatParcelizer(_assertNotNull p0) {
        if (!read(p0)) {
            return false;
        }
        List<_assertNotNull> listOnPause = p0.onPause();
        int size = listOnPause.size();
        for (int i = 0; i < size; i++) {
            if (!RemoteActionCompatParcelizer(listOnPause.get(i))) {
                return false;
            }
        }
        return true;
    }

    private final boolean read(_assertNotNull _assertnotnull) {
        registerModule.IconCompatParcelizer iconCompatParcelizer;
        _assertNotNull _assertnotnull_init_lambda4 = _assertnotnull._init_lambda4();
        registerModule.IconCompatParcelizer iconCompatParcelizer2 = null;
        _assertNotNull.RemoteActionCompatParcelizer remoteActionCompatParcelizerOnSkipToQueueItem = _assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.onSkipToQueueItem() : null;
        if (_assertnotnull.MediaDescriptionCompat() || (_assertnotnull.accessaddObserverForBackInvoker() != Integer.MAX_VALUE && _assertnotnull_init_lambda4 != null && _assertnotnull_init_lambda4.MediaDescriptionCompat())) {
            if (_assertnotnull.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                List<registerModule.IconCompatParcelizer> list = this.IconCompatParcelizer;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        iconCompatParcelizer = null;
                        break;
                    }
                    iconCompatParcelizer = list.get(i);
                    registerModule.IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizer;
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer3.getRemoteActionCompatParcelizer(), _assertnotnull) && !iconCompatParcelizer3.getIconCompatParcelizer()) {
                        break;
                    }
                    i++;
                }
                if (iconCompatParcelizer != null) {
                    return true;
                }
            }
            if (_assertnotnull.getAddOnUserLeaveHintListener()) {
                return true;
            }
            if (_assertnotnull.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                return this.read.RemoteActionCompatParcelizer(_assertnotnull) || _assertnotnull.onSkipToQueueItem() == _assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer || (_assertnotnull_init_lambda4 != null && _assertnotnull_init_lambda4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) || ((_assertnotnull_init_lambda4 != null && _assertnotnull_init_lambda4.PlaybackStateCompat()) || remoteActionCompatParcelizerOnSkipToQueueItem == _assertNotNull.RemoteActionCompatParcelizer.write);
            }
            if (_assertnotnull.onStop()) {
                if (!this.read.RemoteActionCompatParcelizer(_assertnotnull) && _assertnotnull_init_lambda4 != null && !_assertnotnull_init_lambda4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() && !_assertnotnull_init_lambda4.onStop() && remoteActionCompatParcelizerOnSkipToQueueItem != _assertNotNull.RemoteActionCompatParcelizer.write && remoteActionCompatParcelizerOnSkipToQueueItem != _assertNotNull.RemoteActionCompatParcelizer.read) {
                    List<registerModule.IconCompatParcelizer> list2 = this.IconCompatParcelizer;
                    int size2 = list2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(list2.get(i2).getRemoteActionCompatParcelizer(), _assertnotnull)) {
                                break;
                            }
                            i2++;
                        } else {
                            if (_assertnotnull.onSkipToQueueItem() == _assertNotNull.RemoteActionCompatParcelizer.write || _assertnotnull.onSkipToQueueItem() == _assertNotNull.RemoteActionCompatParcelizer.read) {
                                break;
                            }
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_assertnotnull.addOnNewIntentListener(), Boolean.TRUE)) {
            if (_assertnotnull.PlaybackStateCompat()) {
                List<registerModule.IconCompatParcelizer> list3 = this.IconCompatParcelizer;
                int size3 = list3.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        break;
                    }
                    registerModule.IconCompatParcelizer iconCompatParcelizer4 = list3.get(i3);
                    registerModule.IconCompatParcelizer iconCompatParcelizer5 = iconCompatParcelizer4;
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(iconCompatParcelizer5.getRemoteActionCompatParcelizer(), _assertnotnull) && iconCompatParcelizer5.getIconCompatParcelizer()) {
                        iconCompatParcelizer2 = iconCompatParcelizer4;
                        break;
                    }
                    i3++;
                }
                if (iconCompatParcelizer2 != null) {
                    return true;
                }
            }
            if (_assertnotnull.PlaybackStateCompat()) {
                return this.read.read(_assertnotnull, true) || (_assertnotnull_init_lambda4 != null && _assertnotnull_init_lambda4.PlaybackStateCompat()) || remoteActionCompatParcelizerOnSkipToQueueItem == _assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer || (_assertnotnull_init_lambda4 != null && _assertnotnull_init_lambda4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_assertnotnull.getMediaBrowserCompatSearchResultReceiver(), _assertnotnull));
            }
            if (_assertnotnull.onSkipToPrevious() && !this.read.read(_assertnotnull, true) && _assertnotnull_init_lambda4 != null && !_assertnotnull_init_lambda4.PlaybackStateCompat() && !_assertnotnull_init_lambda4.onSkipToPrevious() && remoteActionCompatParcelizerOnSkipToQueueItem != _assertNotNull.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer && remoteActionCompatParcelizerOnSkipToQueueItem != _assertNotNull.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer && (!_assertnotnull_init_lambda4.onStop() || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_assertnotnull.getMediaBrowserCompatSearchResultReceiver(), _assertnotnull))) {
                return false;
            }
        }
        return true;
    }

    private final String AudioAttributesCompatParcelizer(_assertNotNull p0) {
        StringBuilder sb = new StringBuilder();
        sb.append(p0);
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(p0.onSkipToQueueItem());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!p0.MediaDescriptionCompat()) {
            sb.append("[!isPlaced]");
        }
        StringBuilder sb3 = new StringBuilder("[measuredByParent=");
        sb3.append(p0.ResultReceiver());
        sb3.append(']');
        sb.append(sb3.toString());
        if (!read(p0)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    private final String AudioAttributesCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
        sb.append('\n');
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
        read(this, sb, this.AudioAttributesCompatParcelizer, 0);
        return sb.toString();
    }

    private static final void read(getDeserializationConfig getdeserializationconfig, StringBuilder sb, _assertNotNull _assertnotnull, int i) {
        String strAudioAttributesCompatParcelizer = getdeserializationconfig.AudioAttributesCompatParcelizer(_assertnotnull);
        if (strAudioAttributesCompatParcelizer.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(strAudioAttributesCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
            sb.append('\n');
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
            i++;
        }
        List<_assertNotNull> listOnPause = _assertnotnull.onPause();
        int size = listOnPause.size();
        for (int i3 = 0; i3 < size; i3++) {
            read(getdeserializationconfig, sb, listOnPause.get(i3), i);
        }
    }
}
