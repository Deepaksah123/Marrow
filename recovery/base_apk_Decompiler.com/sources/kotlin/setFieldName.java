package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\f\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R(\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015"}, d2 = {"Lo/setFieldName;", "", "<init>", "()V", "Lo/createRootContext;", "p0", "Lo/parse;", "p1", "", "read", "(Lo/createRootContext;Lo/parse;)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "(Lo/createRootContext;)Lo/parse;", "", "write", "(Lo/createRootContext;)Z", "Lo/getFilter;", "RemoteActionCompatParcelizer", "(Lo/getFilter;)V", "Lo/OutputDecorator;", "Lo/setKeyListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setFieldName {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setKeyListener<Object, Object> read = OutputDecorator.RemoteActionCompatParcelizer(null, 1, null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final setKeyListener<Object, Object> IconCompatParcelizer = OutputDecorator.RemoteActionCompatParcelizer(null, 1, null);

    public final void read(createRootContext<Object> p0, parse p1) {
        OutputDecorator.write(this.read, p0, p1);
        OutputDecorator.write(this.IconCompatParcelizer, p1.getAudioAttributesCompatParcelizer(), p0);
    }

    public final void AudioAttributesCompatParcelizer() {
        OutputDecorator.IconCompatParcelizer(this.read);
        OutputDecorator.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    public final parse IconCompatParcelizer(createRootContext<Object> p0) {
        parse parseVar = (parse) OutputDecorator.IconCompatParcelizer(this.read, p0);
        if (OutputDecorator.AudioAttributesCompatParcelizer(this.read)) {
            OutputDecorator.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        return parseVar;
    }

    public final boolean write(createRootContext<Object> p0) {
        return OutputDecorator.write(this.read, p0);
    }

    public final void RemoteActionCompatParcelizer(final getFilter p0) {
        Object objAudioAttributesImplApi26Parcelizer = this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(p0);
        if (objAudioAttributesImplApi26Parcelizer != null) {
            if (objAudioAttributesImplApi26Parcelizer instanceof setDropDownBackgroundResource) {
                setTextAppearance settextappearance = (setTextAppearance) objAudioAttributesImplApi26Parcelizer;
                Object[] objArr = settextappearance.IconCompatParcelizer;
                int i = settextappearance.RemoteActionCompatParcelizer;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj = objArr[i2];
                    toMagicModuleMetaRepoModel.read(obj, "");
                    OutputDecorator.IconCompatParcelizer(this.read, (createRootContext) obj, new getAnswerMap() { // from class: o.nextByte
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(setFieldName.write(p0, (parse) obj2));
                        }
                    });
                }
                return;
            }
            toMagicModuleMetaRepoModel.read(objAudioAttributesImplApi26Parcelizer, "");
            OutputDecorator.IconCompatParcelizer(this.read, (createRootContext) objAudioAttributesImplApi26Parcelizer, new getAnswerMap() { // from class: o.nextByte
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(setFieldName.write(p0, (parse) obj2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(getFilter getfilter, parse parseVar) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(parseVar.getAudioAttributesCompatParcelizer(), getfilter);
    }
}
