package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u0003\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0003\u0010\u0013R$\u0010\u0005\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00148W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0015\"\u0004\b\u0003\u0010\u0016R(\u0010\r\u001a\u0004\u0018\u00010\u00172\b\u0010\t\u001a\u0004\u0018\u00010\u00178W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0018\"\u0004\b\u0011\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/findSerializationTyping;", "", "Lo/calloc;", "AudioAttributesCompatParcelizer", "()J", "IconCompatParcelizer", "(J)V", "RemoteActionCompatParcelizer", "Lo/JsonParserDelegate;", "p0", "()Lo/JsonParserDelegate;", "(Lo/JsonParserDelegate;)V", "Lo/findTypeName;", "MediaBrowserCompatItemReceiver", "()Lo/findTypeName;", "read", "Lo/tryToResolveUnresolved;", "write", "()Lo/tryToResolveUnresolved;", "(Lo/tryToResolveUnresolved;)V", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "(Lo/bufferMapProperty;)V", "Lo/hasAnyGetter;", "()Lo/hasAnyGetter;", "(Lo/hasAnyGetter;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface findSerializationTyping {
    long AudioAttributesCompatParcelizer();

    default void AudioAttributesCompatParcelizer(JsonParserDelegate jsonParserDelegate) {
    }

    default void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty) {
    }

    default void AudioAttributesCompatParcelizer(tryToResolveUnresolved trytoresolveunresolved) {
    }

    void IconCompatParcelizer(long j);

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver */
    findTypeName getRemoteActionCompatParcelizer();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    default hasAnyGetter getAudioAttributesImplApi26Parcelizer() {
        return null;
    }

    default void write(hasAnyGetter hasanygetter) {
    }

    default JsonParserDelegate IconCompatParcelizer() {
        return findUnwrappingNameTransformer.INSTANCE;
    }

    default tryToResolveUnresolved write() {
        return tryToResolveUnresolved.write;
    }

    default bufferMapProperty read() {
        return findSerializationSortAlphabetically.AudioAttributesCompatParcelizer();
    }
}
