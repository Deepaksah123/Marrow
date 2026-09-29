###### Class android.support.v4.app.RemoteActionCompatParcelizer (android.support.v4.app.RemoteActionCompatParcelizer)
.class public final Landroid/support/v4/app/RemoteActionCompatParcelizer;
.super Landroidx/core/app/RemoteActionCompatParcelizer;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Landroidx/core/app/RemoteActionCompatParcelizer;-><init>()V

    return-void
.end method

.method public static read(Lo/getAllPermissionGroups;)Landroidx/core/app/RemoteActionCompat;
    .registers 1

    .line 10
    invoke-static {p0}, Landroidx/core/app/RemoteActionCompatParcelizer;->read(Lo/getAllPermissionGroups;)Landroidx/core/app/RemoteActionCompat;

    move-result-object p0

    return-object p0
.end method

.method public static write(Landroidx/core/app/RemoteActionCompat;Lo/getAllPermissionGroups;)V
    .registers 2

    .line 14
    invoke-static {p0, p1}, Landroidx/core/app/RemoteActionCompatParcelizer;->write(Landroidx/core/app/RemoteActionCompat;Lo/getAllPermissionGroups;)V

    return-void
.end method
