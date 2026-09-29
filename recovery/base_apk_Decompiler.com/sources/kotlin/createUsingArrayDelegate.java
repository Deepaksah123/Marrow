package kotlin;

import kotlin.Metadata;
import kotlin._booleanType;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007"}, d2 = {"Lo/createUsingArrayDelegate;", "Lo/getArrayDelegateCreator;", "<init>", "()V", "Lo/parseDouble;", "", "RemoteActionCompatParcelizer", "()Lo/parseDouble;", "IconCompatParcelizer", "Lo/parseDouble;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class createUsingArrayDelegate implements getArrayDelegateCreator {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private parseDouble<Boolean> RemoteActionCompatParcelizer;

    public createUsingArrayDelegate() {
        this.RemoteActionCompatParcelizer = _booleanType.read() ? RemoteActionCompatParcelizer() : null;
    }

    @Override // kotlin.getArrayDelegateCreator
    public final parseDouble<Boolean> IconCompatParcelizer() {
        parseDouble<Boolean> parsedouble = this.RemoteActionCompatParcelizer;
        if (parsedouble != null) {
            toMagicModuleMetaRepoModel.write(parsedouble);
            return parsedouble;
        }
        if (!_booleanType.read()) {
            return getArrayDelegateType.write;
        }
        parseDouble<Boolean> parsedoubleRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer = parsedoubleRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(parsedoubleRemoteActionCompatParcelizer);
        return parsedoubleRemoteActionCompatParcelizer;
    }

    private final parseDouble<Boolean> RemoteActionCompatParcelizer() {
        _booleanType _booleantypeAudioAttributesCompatParcelizer = _booleanType.AudioAttributesCompatParcelizer();
        if (_booleantypeAudioAttributesCompatParcelizer.IconCompatParcelizer() != 1) {
            InputAccessor inputAccessorRemoteActionCompatParcelizer$default = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
            _booleantypeAudioAttributesCompatParcelizer.read(new read(inputAccessorRemoteActionCompatParcelizer$default, this));
            return inputAccessorRemoteActionCompatParcelizer$default;
        }
        return new createUsingDefaultOrWithoutArguments(true);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/createUsingArrayDelegate$read;", "Lo/_booleanType$IconCompatParcelizer;", "", "read", "()V", "", "p0", "RemoteActionCompatParcelizer", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read extends _booleanType.IconCompatParcelizer {
        final /* synthetic */ InputAccessor<Boolean> IconCompatParcelizer;
        final /* synthetic */ createUsingArrayDelegate RemoteActionCompatParcelizer;

        read(InputAccessor<Boolean> inputAccessor, createUsingArrayDelegate createusingarraydelegate) {
            this.IconCompatParcelizer = inputAccessor;
            this.RemoteActionCompatParcelizer = createusingarraydelegate;
        }

        @Override // o._booleanType.IconCompatParcelizer
        public final void read() {
            this.IconCompatParcelizer.write(Boolean.TRUE);
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer = new createUsingDefaultOrWithoutArguments(true);
        }

        @Override // o._booleanType.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(Throwable p0) {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer = getArrayDelegateType.write;
        }
    }
}
