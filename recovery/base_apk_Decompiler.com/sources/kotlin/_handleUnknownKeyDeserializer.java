package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/_handleUnknownKeyDeserializer;", "", "<init>", "()V", "Lo/_createDeserializer;", "p0", "Lkotlin/Function1;", "Lo/_findCachedDeserializer;", "", "p1", "Lo/parseDouble;", "write", "(Lo/_createDeserializer;Lo/getAnswerMap;)Lo/parseDouble;", "Lo/createUsingDelegate;", "read", "Lo/createUsingDelegate;", "Lo/ActionMenuViewLayoutParams;", "IconCompatParcelizer", "Lo/ActionMenuViewLayoutParams;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _handleUnknownKeyDeserializer {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final createUsingDelegate write = new createUsingDelegate();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final ActionMenuViewLayoutParams<_createDeserializer, _findCachedDeserializer> AudioAttributesCompatParcelizer = new ActionMenuViewLayoutParams<>(16);

    public final parseDouble<Object> write(final _createDeserializer p0, getAnswerMap<? super getAnswerMap<? super _findCachedDeserializer, getShowPopup>, ? extends _findCachedDeserializer> p1) {
        synchronized (this.write) {
            _findCachedDeserializer _findcacheddeserializer = this.AudioAttributesCompatParcelizer.get(p0);
            if (_findcacheddeserializer != null) {
                if (_findcacheddeserializer.getAudioAttributesCompatParcelizer()) {
                    return _findcacheddeserializer;
                }
                this.AudioAttributesCompatParcelizer.remove(p0);
            }
            try {
                _findCachedDeserializer _findcacheddeserializerInvoke = p1.invoke(new getAnswerMap() { // from class: o._createDeserializer2
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return _handleUnknownKeyDeserializer.write(this.read, p0, (_findCachedDeserializer) obj);
                    }
                });
                synchronized (this.write) {
                    if (this.AudioAttributesCompatParcelizer.get(p0) == null && _findcacheddeserializerInvoke.getAudioAttributesCompatParcelizer()) {
                        this.AudioAttributesCompatParcelizer.put(p0, _findcacheddeserializerInvoke);
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
                return _findcacheddeserializerInvoke;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleUnknownKeyDeserializer _handleunknownkeydeserializer, _createDeserializer _createdeserializer, _findCachedDeserializer _findcacheddeserializer) {
        synchronized (_handleunknownkeydeserializer.write) {
            if (_findcacheddeserializer.getAudioAttributesCompatParcelizer()) {
                _handleunknownkeydeserializer.AudioAttributesCompatParcelizer.put(_createdeserializer, _findcacheddeserializer);
            } else {
                _handleunknownkeydeserializer.AudioAttributesCompatParcelizer.remove(_createdeserializer);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        return getShowPopup.INSTANCE;
    }
}
