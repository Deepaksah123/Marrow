package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0080\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0010\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u000b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001e"}, d2 = {"Lo/typeIdResolverInstance;", "", "Lo/_assertNotNull;", "p0", "Lo/abstractTypeResolvers;", "p1", "Lo/setExpandedActionViewsExclusive;", "p2", "<init>", "(Lo/_assertNotNull;Lo/abstractTypeResolvers;Lo/setExpandedActionViewsExclusive;)V", "", "Lo/namingStrategyInstance;", "write", "(I)Lo/namingStrategyInstance;", "Lo/valueInstantiators;", "", "AudioAttributesCompatParcelizer", "(Lo/namingStrategyInstance;Lo/valueInstantiators;)V", "IconCompatParcelizer", "Lo/_assertNotNull;", "RemoteActionCompatParcelizer", "Lo/abstractTypeResolvers;", "read", "Lo/setExpandedActionViewsExclusive;", "Lo/valueInstantiatorInstance;", "()Lo/valueInstantiatorInstance;", "Lo/setDropDownBackgroundResource;", "Lo/EnumFeature;", "Lo/setDropDownBackgroundResource;", "()Lo/setDropDownBackgroundResource;", "()Lo/namingStrategyInstance;", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class typeIdResolverInstance {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setExpandedActionViewsExclusive<_assertNotNull> write;
    private final _assertNotNull IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final abstractTypeResolvers read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setDropDownBackgroundResource<EnumFeature> AudioAttributesCompatParcelizer = new setDropDownBackgroundResource<>(2);

    public typeIdResolverInstance(_assertNotNull _assertnotnull, abstractTypeResolvers abstracttyperesolvers, setExpandedActionViewsExclusive<_assertNotNull> setexpandedactionviewsexclusive) {
        this.IconCompatParcelizer = _assertnotnull;
        this.read = abstracttyperesolvers;
        this.write = setexpandedactionviewsexclusive;
    }

    public final valueInstantiatorInstance read() {
        return new valueInstantiatorInstance(this.read, false, this.IconCompatParcelizer, new C0216valueInstantiators());
    }

    public final setDropDownBackgroundResource<EnumFeature> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final namingStrategyInstance IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final namingStrategyInstance write(int p0) {
        return this.write.AudioAttributesCompatParcelizer(p0);
    }

    public final void AudioAttributesCompatParcelizer(namingStrategyInstance p0, C0216valueInstantiators p1) {
        setDropDownBackgroundResource<EnumFeature> setdropdownbackgroundresource = this.AudioAttributesCompatParcelizer;
        Object[] objArr = setdropdownbackgroundresource.IconCompatParcelizer;
        int i = setdropdownbackgroundresource.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < i; i2++) {
            ((EnumFeature) objArr[i2]).read(p0, p1);
        }
    }
}
