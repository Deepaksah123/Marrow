package kotlin;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import kotlin._ignorableAnnotation;
import kotlin.forOtherUse;
import kotlin.isPresent;

/* JADX INFO: loaded from: classes4.dex */
final class BeanPropertyDefinition<T> implements getPrimaryMember<T> {
    private final boolean AudioAttributesCompatParcelizer;
    private final hasName<?, ?> IconCompatParcelizer;
    private final emptyAnnotations<?> read;
    private final constructPropertyCollector write;

    private BeanPropertyDefinition(hasName<?, ?> hasname, emptyAnnotations<?> emptyannotations, constructPropertyCollector constructpropertycollector) {
        this.IconCompatParcelizer = hasname;
        this.AudioAttributesCompatParcelizer = emptyannotations.AudioAttributesCompatParcelizer(constructpropertycollector);
        this.read = emptyannotations;
        this.write = constructpropertycollector;
    }

    static <T> BeanPropertyDefinition<T> IconCompatParcelizer(hasName<?, ?> hasname, emptyAnnotations<?> emptyannotations, constructPropertyCollector constructpropertycollector) {
        return new BeanPropertyDefinition<>(hasname, emptyannotations, constructpropertycollector);
    }

    @Override // kotlin.getPrimaryMember
    public final T write() {
        return (T) this.write.onMediaButtonEvent().read();
    }

    @Override // kotlin.getPrimaryMember
    public final boolean RemoteActionCompatParcelizer(T t, T t2) {
        if (!this.IconCompatParcelizer.RemoteActionCompatParcelizer(t).equals(this.IconCompatParcelizer.RemoteActionCompatParcelizer(t2))) {
            return false;
        }
        if (this.AudioAttributesCompatParcelizer) {
            return this.read.read(t).equals(this.read.read(t2));
        }
        return true;
    }

    @Override // kotlin.getPrimaryMember
    public final int read(T t) {
        int iHashCode = this.IconCompatParcelizer.RemoteActionCompatParcelizer(t).hashCode();
        return this.AudioAttributesCompatParcelizer ? (iHashCode * 53) + this.read.read(t).hashCode() : iHashCode;
    }

    @Override // kotlin.getPrimaryMember
    public final void IconCompatParcelizer(T t, T t2) {
        hasField.IconCompatParcelizer(this.IconCompatParcelizer, t, t2);
        if (this.AudioAttributesCompatParcelizer) {
            hasField.AudioAttributesCompatParcelizer(this.read, t, t2);
        }
    }

    @Override // kotlin.getPrimaryMember
    public final void AudioAttributesCompatParcelizer(T t, CollectorBase collectorBase) throws IOException {
        Iterator itAudioAttributesImplApi26Parcelizer = this.read.read(t).AudioAttributesImplApi26Parcelizer();
        while (itAudioAttributesImplApi26Parcelizer.hasNext()) {
            Map.Entry entry = (Map.Entry) itAudioAttributesImplApi26Parcelizer.next();
            isPresent.read readVar = (isPresent.read) entry.getKey();
            if (readVar.AudioAttributesCompatParcelizer() != _ignorableAnnotation.AudioAttributesCompatParcelizer.MESSAGE || readVar.RemoteActionCompatParcelizer() || readVar.write()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof forOtherUse.read) {
                collectorBase.read(readVar.read(), ((forOtherUse.read) entry).write().AudioAttributesCompatParcelizer());
            } else {
                collectorBase.read(readVar.read(), entry.getValue());
            }
        }
        AudioAttributesCompatParcelizer(this.IconCompatParcelizer, t, collectorBase);
    }

    private static <UT, UB> void AudioAttributesCompatParcelizer(hasName<UT, UB> hasname, T t, CollectorBase collectorBase) throws IOException {
        hasname.write(hasname.RemoteActionCompatParcelizer(t), collectorBase);
    }

    @Override // kotlin.getPrimaryMember
    public final void AudioAttributesCompatParcelizer(T t, getGetter getgetter, asAnnotations asannotations) throws IOException {
        write(this.IconCompatParcelizer, this.read, t, getgetter, asannotations);
    }

    private <UT, UB, ET extends isPresent.read<ET>> void write(hasName<UT, UB> hasname, emptyAnnotations<ET> emptyannotations, T t, getGetter getgetter, asAnnotations asannotations) throws IOException {
        UB ubIconCompatParcelizer = hasname.IconCompatParcelizer(t);
        isPresent<ET> ispresentRemoteActionCompatParcelizer = emptyannotations.RemoteActionCompatParcelizer(t);
        while (getgetter.IconCompatParcelizer() != Integer.MAX_VALUE) {
            try {
                if (!read(getgetter, asannotations, emptyannotations, ispresentRemoteActionCompatParcelizer, hasname, ubIconCompatParcelizer)) {
                    return;
                }
            } finally {
                hasname.AudioAttributesCompatParcelizer(t, ubIconCompatParcelizer);
            }
        }
    }

    @Override // kotlin.getPrimaryMember
    public final void RemoteActionCompatParcelizer(T t) {
        this.IconCompatParcelizer.write(t);
        this.read.AudioAttributesCompatParcelizer(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends isPresent.read<ET>> boolean read(getGetter getgetter, asAnnotations asannotations, emptyAnnotations<ET> emptyannotations, isPresent<ET> ispresent, hasName<UT, UB> hasname, UB ub) throws IOException {
        int i = getgetter.read();
        if (i != _ignorableAnnotation.AudioAttributesCompatParcelizer) {
            if (_ignorableAnnotation.RemoteActionCompatParcelizer(i) == 2) {
                Object objIconCompatParcelizer = emptyannotations.IconCompatParcelizer(asannotations, this.write, _ignorableAnnotation.read(i));
                if (objIconCompatParcelizer != null) {
                    emptyannotations.read(getgetter, objIconCompatParcelizer, asannotations, ispresent);
                    return true;
                }
                return hasname.RemoteActionCompatParcelizer(ub, getgetter);
            }
            return getgetter.onCommand();
        }
        Object objIconCompatParcelizer2 = null;
        int iOnAddQueueItem = 0;
        AnnotatedWithParams annotatedWithParamsAudioAttributesCompatParcelizer = null;
        while (getgetter.IconCompatParcelizer() != Integer.MAX_VALUE) {
            int i2 = getgetter.read();
            if (i2 == _ignorableAnnotation.RemoteActionCompatParcelizer) {
                iOnAddQueueItem = getgetter.onAddQueueItem();
                objIconCompatParcelizer2 = emptyannotations.IconCompatParcelizer(asannotations, this.write, iOnAddQueueItem);
            } else if (i2 == _ignorableAnnotation.write) {
                if (objIconCompatParcelizer2 != null) {
                    emptyannotations.read(getgetter, objIconCompatParcelizer2, asannotations, ispresent);
                } else {
                    annotatedWithParamsAudioAttributesCompatParcelizer = getgetter.AudioAttributesCompatParcelizer();
                }
            } else if (!getgetter.onCommand()) {
                break;
            }
        }
        if (getgetter.read() != _ignorableAnnotation.IconCompatParcelizer) {
            throw _add.IconCompatParcelizer();
        }
        if (annotatedWithParamsAudioAttributesCompatParcelizer != null) {
            if (objIconCompatParcelizer2 != null) {
                emptyannotations.write(annotatedWithParamsAudioAttributesCompatParcelizer, objIconCompatParcelizer2, asannotations, ispresent);
            } else {
                hasname.read(ub, iOnAddQueueItem, annotatedWithParamsAudioAttributesCompatParcelizer);
            }
        }
        return true;
    }

    @Override // kotlin.getPrimaryMember
    public final boolean write(T t) {
        return this.read.read(t).MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.getPrimaryMember
    public final int AudioAttributesCompatParcelizer(T t) {
        int iWrite = write(this.IconCompatParcelizer, t);
        return this.AudioAttributesCompatParcelizer ? iWrite + this.read.read(t).AudioAttributesCompatParcelizer() : iWrite;
    }

    private static <UT, UB> int write(hasName<UT, UB> hasname, T t) {
        return hasname.AudioAttributesCompatParcelizer(hasname.RemoteActionCompatParcelizer(t));
    }
}
