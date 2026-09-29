package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinDeserializers {
    private final int AudioAttributesCompatParcelizer;
    private final getInstanceParameter RemoteActionCompatParcelizer;

    public KotlinDeserializers(int i, getInstanceParameter getinstanceparameter) {
        toMagicModuleMetaRepoModel.write(getinstanceparameter, "");
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = getinstanceparameter;
    }

    public final getInstanceParameter read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinDeserializers)) {
            return false;
        }
        KotlinDeserializers kotlinDeserializers = (KotlinDeserializers) obj;
        return this.AudioAttributesCompatParcelizer == kotlinDeserializers.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, kotlinDeserializers.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (Integer.hashCode(this.AudioAttributesCompatParcelizer) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenerationalViewportHint(generationId=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", hint=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
