package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\r*\u00020\f2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\f0\rH\u0002¢\u0006\u0004\b\u0004\u0010\u000e"}, d2 = {"Lo/_handleOddName$RemoteActionCompatParcelizer;", "p0", "p1", "", "read", "(Lo/_handleOddName$RemoteActionCompatParcelizer;Lo/_handleOddName$RemoteActionCompatParcelizer;)I", "Lo/_handleOddName$IconCompatParcelizer;", "T", "Lo/writerFor;", "", "write", "(Lo/writerFor;Lo/_handleOddName$IconCompatParcelizer;)V", "Lo/_handleOddName;", "Lo/UTF32Reader;", "(Lo/_handleOddName;Lo/UTF32Reader;Lo/UTF32Reader;)Lo/UTF32Reader;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _considerFilter {
    public static final int read(_handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer, _handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, remoteActionCompatParcelizer2)) {
            return 2;
        }
        return _skipComma.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, remoteActionCompatParcelizer2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends _handleOddName.IconCompatParcelizer> void write(writerFor<T> writerfor, _handleOddName.IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.read(iconCompatParcelizer, "");
        writerfor.IconCompatParcelizer(iconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> read(_handleOddName _handleoddname, UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> uTF32Reader, UTF32Reader<_handleOddName> uTF32Reader2) {
        uTF32Reader2.read(_handleoddname);
        AnonymousClass1 anonymousClass1 = null;
        while (uTF32Reader2.getAudioAttributesCompatParcelizer() != 0) {
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = uTF32Reader2.RemoteActionCompatParcelizer(uTF32Reader2.getAudioAttributesCompatParcelizer() - 1);
            if (_handleoddnameRemoteActionCompatParcelizer instanceof _skipYAMLComment) {
                _skipYAMLComment _skipyamlcomment = (_skipYAMLComment) _handleoddnameRemoteActionCompatParcelizer;
                uTF32Reader2.read(_skipyamlcomment.getWrite());
                uTF32Reader2.read(_skipyamlcomment.getRead());
            } else if (_handleoddnameRemoteActionCompatParcelizer instanceof _handleOddName.RemoteActionCompatParcelizer) {
                uTF32Reader.read(_handleoddnameRemoteActionCompatParcelizer);
            } else {
                if (anonymousClass1 == null) {
                    anonymousClass1 = new AnonymousClass1(uTF32Reader);
                }
                _handleoddnameRemoteActionCompatParcelizer.write(anonymousClass1);
            }
        }
        return uTF32Reader;
    }

    /* JADX INFO: renamed from: o._considerFilter$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_handleOddName$RemoteActionCompatParcelizer;", "p0", "", "read", "(Lo/_handleOddName$RemoteActionCompatParcelizer;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<_handleOddName.RemoteActionCompatParcelizer, Boolean> {
        final /* synthetic */ UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> $read;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(_handleOddName.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.$read.read(remoteActionCompatParcelizer);
            return Boolean.TRUE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UTF32Reader<_handleOddName.RemoteActionCompatParcelizer> uTF32Reader) {
            super(1);
            this.$read = uTF32Reader;
        }
    }
}
