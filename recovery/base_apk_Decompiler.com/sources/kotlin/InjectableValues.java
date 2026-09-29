package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001f\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/unwrappingSerializer;", "Lo/containedTypeCount;", "RemoteActionCompatParcelizer", "Lo/unwrappingSerializer;", "AudioAttributesCompatParcelizer", "()Lo/unwrappingSerializer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InjectableValues {
    private static final unwrappingSerializer<containedTypeCount> RemoteActionCompatParcelizer = acceptJsonFormatVisitor.read(AnonymousClass5.RemoteActionCompatParcelizer);

    @getRenewGrpId
    public static final unwrappingSerializer<containedTypeCount> AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.InjectableValues$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/containedTypeCount;", "RemoteActionCompatParcelizer", "()Lo/containedTypeCount;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<containedTypeCount> {
        public static final AnonymousClass5 RemoteActionCompatParcelizer = new AnonymousClass5();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final containedTypeCount invoke() {
            return null;
        }

        AnonymousClass5() {
            super(0);
        }
    }
}
