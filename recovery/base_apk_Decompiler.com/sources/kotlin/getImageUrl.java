package kotlin;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getImageUrl {

    public interface AudioAttributesCompatParcelizer {
        Set<Boolean> onCommand();
    }

    public static boolean read(Context context) {
        Set<Boolean> setOnCommand = ((AudioAttributesCompatParcelizer) setLessonAuthor.write(context, AudioAttributesCompatParcelizer.class)).onCommand();
        getSubjScore.IconCompatParcelizer(setOnCommand.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setOnCommand.isEmpty()) {
            return true;
        }
        return setOnCommand.iterator().next().booleanValue();
    }
}
