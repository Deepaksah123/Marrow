package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\nJ-\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\r\u0010\u001e"}, d2 = {"Lo/hasValueTypeDeserializer;", "", "Lo/AbstractDeserializer;", "p0", "Lo/findProperty;", "p1", "p2", "<init>", "(Lo/AbstractDeserializer;JLo/findProperty;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "(Ljava/lang/String;JLo/findProperty;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "(Lo/AbstractDeserializer;JLo/findProperty;)Lo/hasValueTypeDeserializer;", "read", "(Ljava/lang/String;JLo/findProperty;)Lo/hasValueTypeDeserializer;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lo/AbstractDeserializer;", "write", "()Lo/AbstractDeserializer;", "RemoteActionCompatParcelizer", "J", "()J", "Lo/findProperty;", "()Lo/findProperty;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasValueTypeDeserializer {
    private static final parseManyDecDigits<hasValueTypeDeserializer, Object> IconCompatParcelizer = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.getValueDeserializer
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return hasValueTypeDeserializer.write((JavaDoubleBitsFromCharSequence) obj, (hasValueTypeDeserializer) obj2);
        }
    }, new getAnswerMap() { // from class: o.setManagedReferenceName
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return hasValueTypeDeserializer.AudioAttributesCompatParcelizer(obj);
        }
    });

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final findProperty IconCompatParcelizer;
    private final AbstractDeserializer read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    private hasValueTypeDeserializer(AbstractDeserializer abstractDeserializer, long j, findProperty findproperty) {
        this.read = abstractDeserializer;
        this.AudioAttributesCompatParcelizer = getValueInstantiator.AudioAttributesCompatParcelizer(j, 0, AudioAttributesCompatParcelizer().length());
        this.IconCompatParcelizer = findproperty != null ? findProperty.AudioAttributesCompatParcelizer(getValueInstantiator.AudioAttributesCompatParcelizer(findproperty.getIconCompatParcelizer(), 0, AudioAttributesCompatParcelizer().length())) : null;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final AbstractDeserializer getRead() {
        return this.read;
    }

    public /* synthetic */ hasValueTypeDeserializer(AbstractDeserializer abstractDeserializer, long j, findProperty findproperty, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, (i & 2) != 0 ? findProperty.INSTANCE.AudioAttributesCompatParcelizer() : j, (i & 4) != 0 ? null : findproperty, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    public /* synthetic */ hasValueTypeDeserializer(String str, long j, findProperty findproperty, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? findProperty.INSTANCE.AudioAttributesCompatParcelizer() : j, (i & 4) != 0 ? null : findproperty, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private hasValueTypeDeserializer(String str, long j, findProperty findproperty) {
        this(new AbstractDeserializer(str, null, 2, 0 == true ? 1 : 0), j, findproperty, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.read.getIconCompatParcelizer();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final findProperty getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static /* synthetic */ hasValueTypeDeserializer AudioAttributesCompatParcelizer$default(hasValueTypeDeserializer hasvaluetypedeserializer, AbstractDeserializer abstractDeserializer, long j, findProperty findproperty, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractDeserializer = hasvaluetypedeserializer.read;
        }
        if ((i & 2) != 0) {
            j = hasvaluetypedeserializer.AudioAttributesCompatParcelizer;
        }
        if ((i & 4) != 0) {
            findproperty = hasvaluetypedeserializer.IconCompatParcelizer;
        }
        return hasvaluetypedeserializer.AudioAttributesCompatParcelizer(abstractDeserializer, j, findproperty);
    }

    public final hasValueTypeDeserializer AudioAttributesCompatParcelizer(AbstractDeserializer p0, long p1, findProperty p2) {
        return new hasValueTypeDeserializer(p0, p1, p2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    public static /* synthetic */ hasValueTypeDeserializer read$default(hasValueTypeDeserializer hasvaluetypedeserializer, String str, long j, findProperty findproperty, int i, Object obj) {
        if ((i & 2) != 0) {
            j = hasvaluetypedeserializer.AudioAttributesCompatParcelizer;
        }
        if ((i & 4) != 0) {
            findproperty = hasvaluetypedeserializer.IconCompatParcelizer;
        }
        return hasvaluetypedeserializer.read(str, j, findproperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hasValueTypeDeserializer read(String p0, long p1, findProperty p2) {
        return new hasValueTypeDeserializer(new AbstractDeserializer(p0, null, 2, 0 == true ? 1 : 0), p1, p2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof hasValueTypeDeserializer)) {
            return false;
        }
        hasValueTypeDeserializer hasvaluetypedeserializer = (hasValueTypeDeserializer) p0;
        return findProperty.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, hasvaluetypedeserializer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, hasvaluetypedeserializer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, hasvaluetypedeserializer.read);
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iMediaBrowserCompatItemReceiver = findProperty.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
        findProperty findproperty = this.IconCompatParcelizer;
        return (((iHashCode * 31) + iMediaBrowserCompatItemReceiver) * 31) + (findproperty != null ? findProperty.MediaBrowserCompatItemReceiver(findproperty.getIconCompatParcelizer()) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldValue(text='");
        sb.append((Object) this.read);
        sb.append("', selection=");
        sb.append((Object) findProperty.RatingCompat(this.AudioAttributesCompatParcelizer));
        sb.append(", composition=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object write(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, hasValueTypeDeserializer hasvaluetypedeserializer) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(_findRemappedType.write(hasvaluetypedeserializer.read, _findRemappedType.read(), javaDoubleBitsFromCharSequence), _findRemappedType.write(findProperty.AudioAttributesCompatParcelizer(hasvaluetypedeserializer.AudioAttributesCompatParcelizer), _findRemappedType.write(findProperty.INSTANCE), javaDoubleBitsFromCharSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hasValueTypeDeserializer AudioAttributesCompatParcelizer(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Boolean bool = Boolean.FALSE;
        Object obj2 = list.get(0);
        parseManyDecDigits<AbstractDeserializer, Object> parsemanydecdigits = _findRemappedType.read();
        findProperty findpropertyIconCompatParcelizer = null;
        AbstractDeserializer abstractDeserializerIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, bool) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj2 != null) ? parsemanydecdigits.IconCompatParcelizer(obj2) : null;
        toMagicModuleMetaRepoModel.write(abstractDeserializerIconCompatParcelizer);
        Object obj3 = list.get(1);
        parseManyDecDigits<findProperty, Object> parsemanydecdigitsWrite = _findRemappedType.write(findProperty.INSTANCE);
        if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, bool) || (parsemanydecdigitsWrite instanceof _addImplicitFactoryCreators)) && obj3 != null) {
            findpropertyIconCompatParcelizer = parsemanydecdigitsWrite.IconCompatParcelizer(obj3);
        }
        toMagicModuleMetaRepoModel.write(findpropertyIconCompatParcelizer);
        return new hasValueTypeDeserializer(abstractDeserializerIconCompatParcelizer, findpropertyIconCompatParcelizer.getIconCompatParcelizer(), (findProperty) null, 4, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    public /* synthetic */ hasValueTypeDeserializer(AbstractDeserializer abstractDeserializer, long j, findProperty findproperty, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, j, findproperty);
    }

    public /* synthetic */ hasValueTypeDeserializer(String str, long j, findProperty findproperty, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, j, findproperty);
    }
}
