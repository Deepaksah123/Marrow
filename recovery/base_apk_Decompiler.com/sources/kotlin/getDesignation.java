package kotlin;

import java.util.Map;
import kotlin.dummyEditor;

/* JADX INFO: loaded from: classes4.dex */
public final class getDesignation implements dummyEditor {
    private final getIntroDurationSeconds AudioAttributesCompatParcelizer;
    private final getLink IconCompatParcelizer;
    private final Map<getRelatedLessonId, getMagicLine<?>> RemoteActionCompatParcelizer;

    public getDesignation(getLink getlink, Map<getRelatedLessonId, getMagicLine<?>> map, getIntroDurationSeconds getintrodurationseconds) {
        if (getlink == null) {
            RemoteActionCompatParcelizer(0);
        }
        if (map == null) {
            RemoteActionCompatParcelizer(1);
        }
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(2);
        }
        this.IconCompatParcelizer = getlink;
        this.RemoteActionCompatParcelizer = map;
        this.AudioAttributesCompatParcelizer = getintrodurationseconds;
    }

    @Override // kotlin.dummyEditor
    public final getLink RemoteActionCompatParcelizer() {
        getLink getlink = this.IconCompatParcelizer;
        if (getlink == null) {
            RemoteActionCompatParcelizer(3);
        }
        return getlink;
    }

    @Override // kotlin.dummyEditor
    public final getNotesCount write() {
        return dummyEditor.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.dummyEditor
    public final Map<getRelatedLessonId, getMagicLine<?>> read() {
        Map<getRelatedLessonId, getMagicLine<?>> map = this.RemoteActionCompatParcelizer;
        if (map == null) {
            RemoteActionCompatParcelizer(4);
        }
        return map;
    }

    @Override // kotlin.dummyEditor
    public final getIntroDurationSeconds IconCompatParcelizer() {
        getIntroDurationSeconds getintrodurationseconds = this.AudioAttributesCompatParcelizer;
        if (getintrodurationseconds == null) {
            RemoteActionCompatParcelizer(5);
        }
        return getintrodurationseconds;
    }

    public final String toString() {
        return setGuessed.read.IconCompatParcelizer(this, null);
    }

    private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
