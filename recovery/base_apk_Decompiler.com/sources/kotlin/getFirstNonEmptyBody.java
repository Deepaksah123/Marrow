package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getFirstNonEmptyBody extends ContentBody {
    public SchemaLessonStatusResponse<getMagicLine<?>> IconCompatParcelizer;
    private final boolean read;
    public getCreatedOnDateMs<SchemaLessonStatusResponse<getMagicLine<?>>> write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getFirstNonEmptyBody(getVariant getvariant, getQuote getquote, getRelatedLessonId getrelatedlessonid, boolean z, getIntroDurationSeconds getintrodurationseconds) {
        super(getvariant, getquote, getrelatedlessonid, null, getintrodurationseconds);
        if (getvariant == null) {
            AudioAttributesCompatParcelizer(0);
        }
        if (getquote == null) {
            AudioAttributesCompatParcelizer(1);
        }
        if (getrelatedlessonid == null) {
            AudioAttributesCompatParcelizer(2);
        }
        if (getintrodurationseconds == null) {
            AudioAttributesCompatParcelizer(3);
        }
        this.read = z;
    }

    @Override // kotlin.Editor
    public final boolean onRewind() {
        return this.read;
    }

    @Override // kotlin.Editor
    public final getMagicLine<?> onPrepareFromSearch() {
        SchemaLessonStatusResponse<getMagicLine<?>> schemaLessonStatusResponse = this.IconCompatParcelizer;
        if (schemaLessonStatusResponse != null) {
            return schemaLessonStatusResponse.invoke();
        }
        return null;
    }

    public final void IconCompatParcelizer(getCreatedOnDateMs<SchemaLessonStatusResponse<getMagicLine<?>>> getcreatedondatems) {
        AudioAttributesCompatParcelizer((SchemaLessonStatusResponse<getMagicLine<?>>) null, getcreatedondatems);
    }

    public final void AudioAttributesCompatParcelizer(SchemaLessonStatusResponse<getMagicLine<?>> schemaLessonStatusResponse, getCreatedOnDateMs<SchemaLessonStatusResponse<getMagicLine<?>>> getcreatedondatems) {
        if (getcreatedondatems == null) {
            AudioAttributesCompatParcelizer(5);
        }
        this.write = getcreatedondatems;
        if (schemaLessonStatusResponse == null) {
            schemaLessonStatusResponse = getcreatedondatems.invoke();
        }
        this.IconCompatParcelizer = schemaLessonStatusResponse;
    }

    private static /* synthetic */ void AudioAttributesCompatParcelizer(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
