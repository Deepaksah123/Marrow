###### Class androidx.work.WorkManagerInitializer (androidx.work.WorkManagerInitializer)
.class public final Landroidx/work/WorkManagerInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/setWebAlpha;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/setWebAlpha<",
        "Lo/getChildIndexByWindowIndex;",
        ">;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 33
    const-string v0, "WrkMgrInitializer"

    invoke-static {v0}, Lo/n;->write(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
