package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\t\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u000e\u001a\u00020\u0010*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u001e\u0010\t\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00168\u0000@BX\u0080\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/DeserializersBase;", "", "<init>", "()V", "Lo/hasValueTypeDeserializer;", "p0", "Lo/fillInStackTrace;", "p1", "", "read", "(Lo/hasValueTypeDeserializer;Lo/fillInStackTrace;)V", "", "Lo/findBeanDeserializer;", "(Ljava/util/List;)Lo/hasValueTypeDeserializer;", "AudioAttributesCompatParcelizer", "()Lo/hasValueTypeDeserializer;", "", "RemoteActionCompatParcelizer", "(Ljava/util/List;Lo/findBeanDeserializer;)Ljava/lang/String;", "(Lo/findBeanDeserializer;)Ljava/lang/String;", "Lo/hasValueTypeDeserializer;", "write", "Lo/findReferenceDeserializer;", "IconCompatParcelizer", "Lo/findReferenceDeserializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeserializersBase {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public hasValueTypeDeserializer write = new hasValueTypeDeserializer(withAdditionalKeySerializers.AudioAttributesCompatParcelizer(), findProperty.INSTANCE.AudioAttributesCompatParcelizer(), (findProperty) null, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public findReferenceDeserializer read = new findReferenceDeserializer(this.write.getRead(), this.write.getAudioAttributesCompatParcelizer(), null);

    public final void read(hasValueTypeDeserializer p0, fillInStackTrace p1) {
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer(), this.read.read());
        boolean z = true;
        boolean z2 = false;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write.getRead().getIconCompatParcelizer(), (Object) p0.getRead().getIconCompatParcelizer())) {
            this.read = new findReferenceDeserializer(p0.getRead(), p0.getAudioAttributesCompatParcelizer(), null);
        } else {
            if (findProperty.IconCompatParcelizer(this.write.getAudioAttributesCompatParcelizer(), p0.getAudioAttributesCompatParcelizer())) {
                z = false;
            } else {
                this.read.write(findProperty.MediaBrowserCompatCustomActionResultReceiver(p0.getAudioAttributesCompatParcelizer()), findProperty.AudioAttributesImplApi26Parcelizer(p0.getAudioAttributesCompatParcelizer()));
            }
            z2 = z;
            z = false;
        }
        if (p0.getIconCompatParcelizer() == null) {
            this.read.write();
        } else if (!findProperty.write(p0.getIconCompatParcelizer().getIconCompatParcelizer())) {
            this.read.IconCompatParcelizer(findProperty.MediaBrowserCompatCustomActionResultReceiver(p0.getIconCompatParcelizer().getIconCompatParcelizer()), findProperty.AudioAttributesImplApi26Parcelizer(p0.getIconCompatParcelizer().getIconCompatParcelizer()));
        }
        if (z || (!z2 && !zRemoteActionCompatParcelizer)) {
            this.read.write();
            p0 = hasValueTypeDeserializer.AudioAttributesCompatParcelizer$default(p0, null, 0L, null, 3, null);
        }
        hasValueTypeDeserializer hasvaluetypedeserializer = this.write;
        this.write = p0;
        if (p1 != null) {
            p1.read(hasvaluetypedeserializer, p0);
        }
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final hasValueTypeDeserializer getWrite() {
        return this.write;
    }

    private final String RemoteActionCompatParcelizer(List<? extends findBeanDeserializer> p0, final findBeanDeserializer p1) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
        sb2.append(this.read.AudioAttributesImplApi26Parcelizer());
        sb2.append(", composition=");
        sb2.append(this.read.read());
        sb2.append(", selection=");
        sb2.append((Object) findProperty.RatingCompat(this.read.MediaBrowserCompatItemReceiver()));
        sb2.append("):");
        sb.append(sb2.toString());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
        sb.append('\n');
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
        IntermediateLoginResponseBody.write(p0, sb, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new getAnswerMap() { // from class: o.findMapLikeDeserializer
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return DeserializersBase.IconCompatParcelizer(p1, this, (findBeanDeserializer) obj);
            }
        });
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence IconCompatParcelizer(findBeanDeserializer findbeandeserializer, DeserializersBase deserializersBase, findBeanDeserializer findbeandeserializer2) {
        String str = findbeandeserializer == findbeandeserializer2 ? " > " : "   ";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(deserializersBase.AudioAttributesCompatParcelizer(findbeandeserializer2));
        return sb.toString();
    }

    private final String AudioAttributesCompatParcelizer(findBeanDeserializer findbeandeserializer) {
        if (findbeandeserializer instanceof Deserializers) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            Deserializers deserializers = (Deserializers) findbeandeserializer;
            sb.append(deserializers.write().length());
            sb.append(", newCursorPosition=");
            sb.append(deserializers.getRemoteActionCompatParcelizer());
            sb.append(')');
            return sb.toString();
        }
        if (findbeandeserializer instanceof getValueTypeDeserializer) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
            getValueTypeDeserializer getvaluetypedeserializer = (getValueTypeDeserializer) findbeandeserializer;
            sb2.append(getvaluetypedeserializer.IconCompatParcelizer().length());
            sb2.append(", newCursorPosition=");
            sb2.append(getvaluetypedeserializer.getWrite());
            sb2.append(')');
            return sb2.toString();
        }
        if (findbeandeserializer instanceof getDeclaringClass) {
            return ((getDeclaringClass) findbeandeserializer).toString();
        }
        if (findbeandeserializer instanceof findArrayDeserializer) {
            return ((findArrayDeserializer) findbeandeserializer).toString();
        }
        if (findbeandeserializer instanceof findEnumDeserializer) {
            return ((findEnumDeserializer) findbeandeserializer).toString();
        }
        if (findbeandeserializer instanceof hasViews) {
            return ((hasViews) findbeandeserializer).toString();
        }
        if (findbeandeserializer instanceof findTreeNodeDeserializer) {
            return ((findTreeNodeDeserializer) findbeandeserializer).toString();
        }
        if (findbeandeserializer instanceof _createAndCacheValueDeserializer) {
            return ((_createAndCacheValueDeserializer) findbeandeserializer).toString();
        }
        if (findbeandeserializer instanceof getProperty) {
            return ((getProperty) findbeandeserializer).toString();
        }
        if (findbeandeserializer instanceof findCollectionLikeDeserializer) {
            return ((findCollectionLikeDeserializer) findbeandeserializer).toString();
        }
        StringBuilder sb3 = new StringBuilder("Unknown EditCommand: ");
        String strAudioAttributesImplApi26Parcelizer = toMagicModuleMetaDataUcModel.write(findbeandeserializer.getClass()).AudioAttributesImplApi26Parcelizer();
        if (strAudioAttributesImplApi26Parcelizer == null) {
            strAudioAttributesImplApi26Parcelizer = "{anonymous EditCommand}";
        }
        sb3.append(strAudioAttributesImplApi26Parcelizer);
        return sb3.toString();
    }

    public final hasValueTypeDeserializer read(List<? extends findBeanDeserializer> p0) {
        findBeanDeserializer findbeandeserializer;
        findBeanDeserializer findbeandeserializer2 = null;
        try {
            int size = p0.size();
            int i = 0;
            findBeanDeserializer findbeandeserializer3 = null;
            while (i < size) {
                try {
                    findbeandeserializer = p0.get(i);
                } catch (Exception e) {
                    e = e;
                    findbeandeserializer2 = findbeandeserializer3;
                }
                try {
                    findbeandeserializer.read(this.read);
                    i++;
                    findbeandeserializer3 = findbeandeserializer;
                } catch (Exception e2) {
                    e = e2;
                    findbeandeserializer2 = findbeandeserializer;
                    throw new RuntimeException(RemoteActionCompatParcelizer(p0, findbeandeserializer2), e);
                }
            }
            AbstractDeserializer abstractDeserializerMediaMetadataCompat = this.read.MediaMetadataCompat();
            long jMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
            findProperty findpropertyAudioAttributesCompatParcelizer = findProperty.AudioAttributesCompatParcelizer(jMediaBrowserCompatItemReceiver);
            findpropertyAudioAttributesCompatParcelizer.getIconCompatParcelizer();
            findProperty findproperty = findProperty.AudioAttributesImplApi21Parcelizer(this.write.getAudioAttributesCompatParcelizer()) ? null : findpropertyAudioAttributesCompatParcelizer;
            hasValueTypeDeserializer hasvaluetypedeserializer = new hasValueTypeDeserializer(abstractDeserializerMediaMetadataCompat, findproperty != null ? findproperty.getIconCompatParcelizer() : getValueInstantiator.write(findProperty.AudioAttributesImplApi26Parcelizer(jMediaBrowserCompatItemReceiver), findProperty.MediaBrowserCompatCustomActionResultReceiver(jMediaBrowserCompatItemReceiver)), this.read.read(), (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
            this.write = hasvaluetypedeserializer;
            return hasvaluetypedeserializer;
        } catch (Exception e3) {
            e = e3;
        }
    }
}
