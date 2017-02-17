import module namespace sec="http://marklogic.com/xdmp/security" at "/MarkLogic/security.xqy";
let $permissions := xdmp:document-get-permissions("/consultants/sthomas.xml")
return <permissions> { for $permission in $permissions
let $result := xdmp:invoke-function( 
        function() { <permission> {sec:get-role-names($permission/sec:role-id)/string()} 
        <capability>{$permission/sec:capability/string()} </capability></permission>},
        <options xmlns="xdmp:eval">
          <modules>{xdmp:modules-database()}</modules>
          <database>{xdmp:database("Security")}</database>
        </options>
    )
    
return $result }
</permissions>
