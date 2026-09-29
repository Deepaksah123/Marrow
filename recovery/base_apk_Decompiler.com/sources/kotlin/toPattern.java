package kotlin;

import java.io.IOException;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class toPattern implements findConstructor {
    private final withTimeZone.IconCompatParcelizer IconCompatParcelizer;
    private _appendNativeIds RemoteActionCompatParcelizer;
    private final findConstructor write;

    public toPattern(findConstructor findconstructor, withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
        this.write = findconstructor;
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        return this.write.read(closeonfailandthrowasioe);
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        _appendNativeIds _appendnativeids = new _appendNativeIds(findrawsupertypes, this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = _appendnativeids;
        this.write.read(_appendnativeids);
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        return this.write.RemoteActionCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        _appendNativeIds _appendnativeids = this.RemoteActionCompatParcelizer;
        if (_appendnativeids != null) {
            _appendnativeids.AudioAttributesCompatParcelizer();
        }
        this.write.write(j, j2);
    }

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
        this.write.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.findConstructor
    public final findConstructor write() {
        return this.write;
    }
}
