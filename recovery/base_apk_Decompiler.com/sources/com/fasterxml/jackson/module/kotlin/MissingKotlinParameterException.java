package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import kotlin.ApplicationData;
import kotlin.Metadata;
import kotlin.getRenewGrpId;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/MissingKotlinParameterException;", "Lcom/fasterxml/jackson/databind/exc/MismatchedInputException;", "Lo/ApplicationData;", "p0", "Lcom/fasterxml/jackson/core/JsonParser;", "p1", "", "p2", "<init>", "(Lo/ApplicationData;Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;)V", "parameter", "Lo/ApplicationData;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MissingKotlinParameterException extends MismatchedInputException {
    private final transient ApplicationData parameter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingKotlinParameterException(ApplicationData applicationData, JsonParser jsonParser, String str) {
        super(jsonParser, str);
        toMagicModuleMetaRepoModel.write(applicationData, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.parameter = applicationData;
    }
}
